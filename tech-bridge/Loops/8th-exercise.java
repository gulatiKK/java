import java.util.*;
public class Main {
    public static void main(String[] args) {
        int userInput;
        int evenDigitSum = 0;
        int lastDigit;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

        lastDigit = userInput % 10;

        while(userInput != 0){
            lastDigit = userInput % 10;
            if(lastDigit % 2 == 0){
                lastDigit = userInput % 10;
                evenDigitSum = evenDigitSum + lastDigit;
                userInput = userInput / 10;
            }

            else{
                userInput = userInput / 10;
                lastDigit = userInput % 10;
                evenDigitSum = evenDigitSum + 0;
            }
    }

    System.out.println(evenDigitSum);
  }
}