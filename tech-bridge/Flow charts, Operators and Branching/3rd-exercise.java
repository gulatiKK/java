import java.util.*;
public class Main
{
    public static void main(String[] args){
        double input;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        input = scan.nextDouble();

        if(input>99 || input<1){
            System.out.println("Please specify a number greater than 0 and less than 100");
        } else {
            System.out.println(input);
        }
    }
}