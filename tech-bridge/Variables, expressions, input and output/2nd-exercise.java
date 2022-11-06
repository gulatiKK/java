import java.util.*;
public class Main
{
    public static void main(String[] args){
        double one;
        double two;
        double average;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first number?");
        one = scan.nextDouble();
        System.out.println("What is the second number?");
        two = scan.nextDouble();
        average = (one+two)/2;
        System.out.println(average);
    }
    }