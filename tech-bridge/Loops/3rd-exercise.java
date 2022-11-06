import java.util.*;
public class Main {

    public static void main(String[] args) {
        int oneNumber = 0;
        int twoNumber = 0;
        int lcm;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the first number?");
        System.out.println(oneNumber);
        oneNumber = scan.nextInt();
        System.out.println(oneNumber);
        System.out.println("What is the second number?");
        twoNumber = scan.nextInt();
            lcm = Math.min(oneNumber , twoNumber);
    while(true) {
      if( lcm % oneNumber == 0 && lcm % twoNumber == 0 ) {
        System.out.printf("The LCM of " + oneNumber + " and " + twoNumber + " is " + lcm);
        break;
      }
      ++lcm;
    }
    }
  }