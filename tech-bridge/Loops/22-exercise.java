import java.util.*;  
public class Main {  
  
   public static void main(String[] args) {  
    int n;
    int remainder = 1;
    int number;
    int sum = 0;    
    Scanner scan = new Scanner(System.in);  
    System.out.print("Enter a number you want to check: ");  
    n = scan.nextInt();  
    number = n;  
    while (number > 9)
    {     
    while (number > 0)  
    {   
    remainder = number % 10;   
    sum = sum + remainder;  
    number = number / 10;     
    }  
    number = sum;  
    sum = 0;  
    }  
    if (number == 1)  
    {  
    System.out.println("The given number is a magic number.");  
    }  
    else  
    {  
    System.out.println("The given number is not a magic number.");  
    }  
   }  
}  