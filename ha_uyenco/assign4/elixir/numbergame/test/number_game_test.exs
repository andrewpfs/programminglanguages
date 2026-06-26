defmodule NumberGameTest do
  use ExUnit.Case
  doctest NumberGame

  test "testing evaluate_guess" do
    assert NumberGame.evaluate_guess(20, 20) == :correct
    assert NumberGame.evaluate_guess(10, 20) == :low
    assert NumberGame.evaluate_guess(30, 20) == :high
  end

  test "play function test, guessing 20" do
    read_guess = fn -> 20 end

    display = fn attempts, result ->
        assert attempts == 1
        assert result == :correct
        send(self(), {:display_called_1})
    end

	NumberGame.play(20, read_guess, display)

    assert_received {:display_called_1}
  end

  test "first guess low, second guess correct" do
    Process.put(:guesses, [10, 20])

    read_guess = fn ->
      [next | rest] = Process.get(:guesses)
      Process.put(:guesses, rest)
      next
	end

  	display = fn attempts, result ->
      case attempts do
        1 -> assert result == :low
        2 -> assert result == :correct
	  end

      send(self(), {:display_called_2})
    end

  	NumberGame.play(20, read_guess, display)

    assert_received {:display_called_2}
  end

  test "first guess low, second guess high, third guess correct" do
    Process.put(:guesses, [10, 30, 20])

    read_guess = fn ->
      [next | rest] = Process.get(:guesses)
      Process.put(:guesses, rest)
      next
	  end

  	display = fn attempts, result ->
      case attempts do
        1 -> assert result == :low
        2 -> assert result == :high
        3 -> assert result == :correct
	  end

      send(self(), {:display_called_3})
    end

  	NumberGame.play(20, read_guess, display)

    assert_received {:display_called_3}
  end

  test "generate_number test" do
    target = NumberGame.generate_number()

    assert target > 0 && target < 100
  end

  test "generate_number test, two calls are different" do
    target_1 = NumberGame.generate_number()
    target_2 = NumberGame.generate_number()
    assert target_1 != target_2
  end
end
