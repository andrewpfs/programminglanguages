package perfectapp;

public class PerfectNumberChecker {
  public static boolean isPerfectNumber(int number){
    int result = 1; 
    
    for(int i = 2; i <= number; i++){
      if(number % i == 0){
        result += i;
      }  
    }

    return result == number * 2;
  }
}
