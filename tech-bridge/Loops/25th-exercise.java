import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args) 
    {
        int userInput;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the number?");
        userInput = scan.nextInt();
        for(int i = 1; i < userInput; i++)
        {
            if(userInput % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == userInput)
        {
            System.out.println(userInput + " is a perfect number");
        }
        else
        {
            System.out.println(userInput + " is not a perfect number");
        }    
    }
    int divisor(int x)
    {
       return x;
    }
}