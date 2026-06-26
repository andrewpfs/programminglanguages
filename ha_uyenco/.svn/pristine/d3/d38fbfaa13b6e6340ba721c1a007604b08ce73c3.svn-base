import java.util.Scanner;

public class CharacterCounter {
  public static void countChars(String string, int position, int as, int ks, int es, int ws) {
    if (position == string.length()) {
      System.out.println("A: " + as);
      System.out.println("K: " + ks);
      System.out.println("E: " + es);
      System.out.println("W: " + ws);      
	  return;
	}
	    
	switch(string.charAt(position)) {
      case 'A': 
        countChars(string, position + 1, as + 1, ks, es, ws);
		break;
      case 'K':
        countChars(string, position + 1, as, ks + 1, es, ws);
        break;
      case 'E':
        countChars(string, position + 1, as, ks, es + 1, ws);
        break;
      case 'W':
        countChars(string, position + 1, as, ks, es, ws + 1);
        break;
	  default: 
        countChars(string, position + 1, as, ks, es, ws);
		break;
	}
  }
  
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    String string = reader.nextLine();
    System.out.println("String: " + string);
	countChars(string, 0, 0, 0, 0, 0);
  }
}