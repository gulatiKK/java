import java.util.*;
public class Main {
    public static void main(String[] args) {
        int userInput;
        int i = 1;
        int sum = 0;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

        while(i <= userInput){
            sum = sum + i;
            i++;
        }

        System.out.println("The sum of the number and the numbers descending is " + sum);
    }
  }