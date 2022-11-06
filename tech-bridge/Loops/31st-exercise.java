import java.util.*;
public class Main { 
 
    public static void main(String args[]) { 
        int inputNumber;
        int sqrtNum;
        int product;

        System.out.println("What is the number?");
        Scanner scan = new Scanner(System.in);
        inputNumber = scan.nextInt();        
        sqrtNum = (int) Math.sqrt(inputNumber);
        product = sqrtNum * (sqrtNum + 1);
        if (product == inputNumber)
            System.out.println(inputNumber + " is a Pronic Number");
        else
            System.out.println(inputNumber + " is not a Pronic Number"); 
 
   }
}