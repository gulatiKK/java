import java.util.*;
public class Main
{
    public static void main(String[] args){
        double p;
        double r;
        double t;
        double answer;
        double n;

        Scanner scan = new Scanner(System.in);
        System.out.println("How much money was borrowed?");
        p = scan.nextDouble();
        System.out.println("How much is the annual interest rate?");
        r = scan.nextDouble();
        System.out.println("How many years is the money borrowed for?");
        t = scan.nextInt();

        System.out.println("How many times is the value compounded?");
        n = scan.nextDouble();

        answer = p * (Math.pow((1 + r/(n*100)),(n*t)));
        System.out.println(answer);
    }
}