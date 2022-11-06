import java.util.*;
public class Main {
    public static void main(String[] args) {
  
      int oneNumber; 
      int twoNumber;

      Scanner scan = new Scanner (System.in);
      System.out.println("What is the first number?");
      oneNumber = scan.nextInt();
      System.out.println("What is the second number?");
      twoNumber = scan.nextInt();
      int hcf = 1;
  
      for (int i = 1; i <= oneNumber && i <= twoNumber; ++i) {
  
        if (oneNumber % i == 0 && twoNumber % i == 0)
          hcf = i;
      }
  
      System.out.println("HCF of " + oneNumber +" and " + twoNumber + " is " + hcf);
    }
  }