import java.util.*;
public class Main
{
    public static void main(String[] args){
        double radius;
        double pi = 3.14;
        double area;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the radius?");
        radius = scan.nextDouble();
        area = radius*radius*3.14;
        System.out.println(area);
    }
    }