defmodule NumberGameApp do
  def main(_args \\ []) do
    target = NumberGame.generate_number()

    IO.puts("Welcome to the Number Guessing Game!")

    read_guess = fn ->
      IO.gets("Enter your guess: ")
      |> String.trim()
      |> String.to_integer()
    end

    display = fn attempts, result ->
      case result do
        :low -> IO.puts("Attempt #{attempts}: Too low!")
        :high -> IO.puts("Attempt #{attempts}: Too high!")
        :correct -> IO.puts("Correct! You won in #{attempts} attempts!")
      end
    end

    NumberGame.play(target, read_guess, display)
  end
end
