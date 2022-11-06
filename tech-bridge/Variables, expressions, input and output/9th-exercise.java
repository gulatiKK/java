import java.util.*;
public class Main
{
    public static void main(String[] args){
        double faren;
        double cel;

        Scanner scan = new Scanner(System.in);
        System.out.println("How much Celsius is it?");
        cel = scan.nextDouble();
        faren = (cel*9/5) + 32;
        System.out.println(cel + " Celsius = " + faren + " Farenheit");
    }
    }