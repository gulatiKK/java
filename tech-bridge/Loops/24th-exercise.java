import java.util.Scanner;

class PalindromeExample{  
    public static void main(String args[]){  
        int r;
        int sum = 0;
        int temp;    
        int n;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        n = scan.nextInt();

        temp = n;    
        while(n>0){    
        r = n % 10;  
        sum = (sum*10) + r;    
        n = n/10;    
        }    
        if(temp==sum)    
        System.out.println(temp + " is a palindrome number ");    
        else    
        System.out.println(temp + " is not a palindrome number");    
   }  
   }  