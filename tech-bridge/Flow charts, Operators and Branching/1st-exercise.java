import java.util.*;
public class Main
{
    public static void main(String[] args){
        double a;
        double b;
        double c;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first number?");
        a = scan.nextDouble();
        System.out.println("What is the second number?");
        b = scan.nextDouble();
        System.out.println("What is the third number?");
        c = scan.nextDouble();
        System.out.println("The biggest number is:");

        if (a> b && a>c){
            System.out.println(a);
        }

        else if(b>a && b>c){
            System.out.println(b);
        }

        else if(c>b && c>a){
            System.out.println(c);
        }
    }
}