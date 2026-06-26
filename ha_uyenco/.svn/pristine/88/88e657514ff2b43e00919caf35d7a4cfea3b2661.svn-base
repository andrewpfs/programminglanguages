public class funcAssign1 {	
	public static int perfNum (int num, int result, int factor){
		if (factor > num/2) { //only iterates through first half of number
			return result;
		}
		if (num % factor == 0) { //if a factor
			return result = perfNum(num, result + factor, factor + 1);
		}
		return result = perfNum(num, result, factor + 1); //if not a factor
	}
	
    public static void main(String [] args){
        for(int test = 0; test < 10000; test++){ //test cases
			int result = perfNum(test, 1, 2); 
			if (result == test && result != 1) {
				System.out.println(test + " is a perfect number"); 
			}
		}
    }
}

			


