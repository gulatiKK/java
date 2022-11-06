import java.util.*;
public class Main {
static int reverseTheNumber(int temp)
{
    int ans = 0;
    while (temp > 0) {
        int rem = temp % 10;
        ans = ans * 10 + rem;
        temp = temp / 10;
    }
    return ans;
}
 
static int convert0To5(int num)
{
    if (num == 0)
        return 5;

    else {
        int temp = 0;
 
        while (num > 0) {
            int digit = num % 10;
           
            
            if (digit == 0)
                digit = 5;
 
            temp = temp * 10 + digit;
            num = num / 10;
        }
       
        
        
        return reverseTheNumber(temp);
    }
}
 
    
    public static void main(String args[])
    {
        int userInput;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

        System.out.println(convert0To5(userInput));
    }
}
 