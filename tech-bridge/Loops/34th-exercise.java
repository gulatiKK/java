import java.util.Scanner;

public class Main {  
    static boolean kaprekar(int n)   
    {   
        if (n == 1)   
           return true;   
        int sq_n = n * n;   
        int count_digits = 0;   
        while (sq_n != 0)   
        {   
            count_digits++;   
            sq_n /= 10;   
        }   
        sq_n = n*n;   
        for (int r_digits=1; r_digits<count_digits; r_digits++)   
        {   
             int eq_parts = (int) Math.pow(10, r_digits);   
            if (eq_parts == n)   
                continue;   
             int sum = sq_n/eq_parts + sq_n % eq_parts;   
             if (sum == n)   
               return true;   
        }   
        return false;   
    }       
    public static void main (String[] args)   
    {   
        int userInput;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

            if (kaprekar(userInput)){   
                 System.out.print(userInput + " is a kaprekar number");   
            }

            else{
                System.out.println(userInput + " is not a kaprekar number");
            }
    }   
}   