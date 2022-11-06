import java.util.*;  
public class Main {  
  
   public static void main(String[] args) {  
    int a;
    int b;
    int i = 2;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number: ");
     a = scan.nextInt();

    System.out.print("Enter second number: ");
    b = scan.nextInt();

    boolean isAPrime = true;

    for (i = 2; i <= a / 2; i++) {

        if (a % i == 0) {
            isAPrime = false;
            break;
        }

    }

    if (isAPrime && Math.abs(a - b) == 2) {
        
        boolean isBPrime = true;
        
        for (i = 2; i <= b / 2; i++) {

            if (b % i == 0) {
                isBPrime = false;
                break;
            }
            
        }
        
        if (isBPrime)
            System.out.println(a + " and " + b + " are twin prime");
        else
            System.out.println(a + " and " + b + " are not twin prime");
    }
    else
        System.out.println(a + " and " + b + " are not twin prime");
   }  
}  