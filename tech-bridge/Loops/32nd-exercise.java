import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
public class Main {  
   
   public static boolean checkNumber(int number) {  
  
      while(number != 0) {  
         if(number % 10 == 0)  
            return true; 
         number = number / 10;  
      }  
  
      return false;
   }   
    public static void main(String args[])   
    {     
        int userInput;  
        
        Scanner scan = new Scanner(System.in);  
        System.out.println("What is the number?");   
        userInput = scan.nextInt();   
          
        if (checkNumber(userInput))   
            System.out.println(userInput + " is a Duck number");   
        else  
            System.out.println(userInput + " is not a Duck number");   
    }  
}  