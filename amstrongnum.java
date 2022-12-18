import java.util.*;
public class amstrongnum {

    public static void main(String[] args) {

        int number = 0;
        int originalNumber;
        int remainder;
        int result = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        originalNumber = scan.nextInt();
        number = originalNumber;

        // originalNumber - 132
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            // remainder - 2
            // remainder - 3
            // remainder - 1
            result += Math.pow(remainder, 3);
            // result - 8
            // result - 35
            // result - 36
            originalNumber /= 10;
            // originalNumber = 13
            // originalNumber - 1
            // originalNumber - 0
        }
        // originalNumber = 0
       

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

