import java.util.*;
public class Main {
    public static void main(String[] args) {
        int userInput;
        int sum = 0;
        int lastDigit;
        int firstDigit;
        int digitCount = 0;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

        lastDigit = userInput % 10;

        while(userInput != 0){
            digitCount++;
            userInput = userInput / 10;
        }

        if(lastDigit > 10){
            System.out.println(lastDigit);
        }

        else{
            firstDigit = (int) userInput/ (int) Math.pow(10,digitCount-1);
            sum = firstDigit + lastDigit;
        }

        System.out.println(sum);
  }
}