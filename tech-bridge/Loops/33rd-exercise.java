import java.util.*;  
public class Main {   
    public static void main(String args[]){   
        int userInput;  
        int rem = 0;
        int sum = 0;   
        int n;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

        n = userInput;
          
        do{
            rem = userInput % 10;  
            sum = sum + rem;  
            userInput = userInput / 10; 
        }
        while(userInput > 0);
  
        if(n % sum == 0){  
            System.out.println(n + " is a harshad number");  
        }
        else { 
            System.out.println(n + " is not a harshad number");   
        } 
    }  
}  