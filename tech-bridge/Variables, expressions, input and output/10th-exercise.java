import java.util.*;
public class Main
{
    public static void main(String[] args){
        double faren;
        double cel;

        Scanner scan = new Scanner(System.in);
        System.out.println("How much Farenheit is it?");
        faren = scan.nextDouble();
        cel = (faren-32) * 5/9;
        System.out.println(faren + " Farenheit = " + cel + " Celsius");
    }
    }