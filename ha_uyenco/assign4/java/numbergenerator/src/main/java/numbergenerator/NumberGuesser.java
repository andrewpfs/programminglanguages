package numbergenerator;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.Random;


enum Result{
  LOW,
  HIGH,
  CORRECT
}

public interface NumberGuesser {
  static Result evaluateGuess(int guess, int number){
    return switch (Integer.compare(guess, number)) {
      case -1 -> Result.LOW;
      case 1  -> Result.HIGH;
      default -> Result.CORRECT;
    };
  }
  
  private static Result playStep(int attempt, int target, Supplier<Integer> readGuess, BiConsumer<Integer, Result> display){
    int guess = readGuess.get();
    Result result = evaluateGuess(guess, target);
    display.accept(attempt, result);
    return result;
  }

  static void play(int target, Supplier<Integer> readGuess, BiConsumer<Integer, Result> display){ 
    IntStream.iterate(1, i -> i + 1)
      .filter(attempt -> playStep(attempt, target, readGuess, display) == Result.CORRECT)
      .findFirst();
  }
  
  static int generateTarget(){ 
    return new Random().nextInt(100);
  }
}