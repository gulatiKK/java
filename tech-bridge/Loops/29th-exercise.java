import java.util.Scanner;  
class FindingKrishnamurthyNumber {   
    static int fact(int number)   
    {   
        int f = 1;   
        while (number != 0) {   
            f = f * number;   
            number--;   
        }   
        return f;   
    }   
    static boolean checkNumber(int number)   
    {   
        int sum = 0;
          
        int tempNumber = number; 

        while (tempNumber != 0) {     
            sum = sum + fact(tempNumber % 10);  
            tempNumber = tempNumber / 10;   
        }    
        if(sum == number)  {
            return true; 
        } 
        else{
            return false;  
        }
    }    
    public static void main(String[] args)   
    {   
        int userInput;  
        
        Scanner scan = new Scanner(System.in);   
        System.out.println("What is the number?");  
        userInput = scan.nextInt();  
         
        if (checkNumber(userInput)) {  
            System.out.println(userInput + " is a krishnamurthy number"); 
        }  
        else  {
            System.out.println(userInput + " is not a krishnamurthy number");   
        }
    }   
}  