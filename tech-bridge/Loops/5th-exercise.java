import java.util.*;
public class Main {
    public static void main(String[] args) {
        int userInput;
        long fact = 1;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

        int i = 1;

        for(i = 1; i<=userInput; i++){
            fact = fact*i;
        }
        System.out.println("The factorial of " + userInput + " is " + fact);
    }
  }