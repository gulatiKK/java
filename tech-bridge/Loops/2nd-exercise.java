import java.util.*;
public class Main {

    public static void main(String[] args) {
      int userInput;

      Scanner scan = new Scanner(System.in);
      System.out.println("What is the userInput?");
      userInput = scan.nextInt();
  
      System.out.print("Factors of " + userInput + " are: ");
  
      for (int i = 1; i <= userInput; ++i) {
  
        if (userInput % i == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }