import java.util.*;
public class Main
{
    public static void main(String[] args){
        double base;
        double height;
        double area;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the base length?");
        base = scan.nextDouble();
        System.out.println("What is the height?");
        height = scan.nextDouble();
        area = (base*height)/2;
        System.out.println("The area is:");
        System.out.println(area);   
    }
    }