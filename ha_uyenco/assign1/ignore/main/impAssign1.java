

public class impAssign1 {
    public static boolean perfectNumber(int num){
            int result = 1;
            for(int i =2; i <= num/2 ; i++){      
                if(num % i == 0){
                    result += i;
                }  
            }
            
            if(result == num && result != 1){
                System.out.println(num + " is a perfect number"); 
                return true;
            }
            System.out.println(num + " is not a perfect number");
            return false;
        }
       
    }


			
