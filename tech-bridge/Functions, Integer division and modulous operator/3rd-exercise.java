import java.util.*;
public class Main
{
    public static void main(String[] args){
        double a;
        double b;
        double c;
        double d;
        double distance;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the first number for the first pair of coordinates?");
        a = scan.nextDouble();
        System.out.println("What is the second number for the first pair of coordinates?");
        b = scan.nextDouble();
        System.out.println("What is the first number in the second pair of coordiantes?");
        c = scan.nextDouble();
        System.out.println("What is the second number in the second pair of coordiantes?");
        d = scan.nextDouble();
        distance = Math.sqrt(((c-a)*(c-a) + (d-b) * (d-b)));
        System.out.println("Distance between these coordinates is " + distance);
    }
}