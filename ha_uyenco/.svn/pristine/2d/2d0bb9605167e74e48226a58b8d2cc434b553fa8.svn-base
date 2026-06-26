defmodule NumberGame do
  def evaluate_guess(guess, target) do
	cond do
      guess < target -> :low
      guess > target -> :high
	  true  -> :correct
    end
  end
  
  def play_step(attempt, target, readGuess, display) do
    guess = readGuess.()
    result = evaluate_guess(guess, target)
    display.(attempt, result)
	result
  end
  
  def play(target, readGuess, display) do
    Stream.iterate(1, &(&1 + 1))
      |> Enum.find(fn attempt -> play_step(attempt, target, readGuess, display) == :correct end)
  end
  
  def generate_number() do
    Enum.random(1..100)
  end
end
