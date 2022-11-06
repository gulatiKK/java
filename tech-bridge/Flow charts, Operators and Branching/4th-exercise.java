import java.util.*;
public class Main
{
    public static void main(String[] args){
        double oneNumber;
        double twoNumber;
        double ab;
        double ba;


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first number?");
        oneNumber = scan.nextDouble();
        System.out.println("What is the second number?");
        twoNumber = scan.nextDouble();

        ab = oneNumber-twoNumber;
        ba = twoNumber- oneNumber;

        if(oneNumber>twoNumber){
            System.out.println(ab);
        }

        else if(twoNumber>oneNumber){
            System.out.println(ba);
        }
    }
}