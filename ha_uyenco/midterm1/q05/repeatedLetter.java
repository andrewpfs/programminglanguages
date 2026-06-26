package q05;

public class repeatedLetter {

  public static String repeatedLetters(String input) {
    if (input.length() == 1)
    {
      return " ";
    } 
    char first = input.charAt(0);
    String remainder = input.substring(1);
    if (remainder.indexOf(first) != -1) {
      return String.valueOf(first);
    }
    return repeatedLetters(remainder);
  }
}
