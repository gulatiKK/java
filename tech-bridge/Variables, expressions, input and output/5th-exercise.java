import java.util.*;
public class Main
{
    public static void main(String[] args){
        double breadth;
        double length;
        double area;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the breadth?");
        breadth = scan.nextDouble();
        System.out.println("What is the length?");
        length = scan.nextDouble();
        area = breadth*length;
        System.out.println("The area is:");
        System.out.println(area);   
    }
    }