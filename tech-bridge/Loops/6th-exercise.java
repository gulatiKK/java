import java.util.*;
public class Main {
    public static void main(String[] args) {
        int userInput;
        int sum = 0;
        int lastDigit;

        Scanner scan = new Scanner (System.in);
        System.out.println("What are the numbers? (don't seperate them with commas)");
        userInput = scan.nextInt();


       do{
        lastDigit = userInput % 10;
        sum = sum + lastDigit;
        userInput = userInput / 10;
       } while(userInput != 0);

        System.out.println("The sum of the given numbers is " + sum);
    }
  }