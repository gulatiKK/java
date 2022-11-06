import java.util.*;
public class Main
{
    public static void main(String[] args){
        double bodyWeight;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the body weight?");
        bodyWeight = scan.nextDouble();

        if (bodyWeight<18.5){
            System.out.println("The person is thin");
        }

        else if (bodyWeight>18.5&&bodyWeight<25){
            System.out.println("The person is normal");
        }

        else if (bodyWeight>25&&bodyWeight<30){
            System.out.println("The person is overweight");
        }

        else if (bodyWeight>30){
            System.out.println("The person is obese");
        }
    }
}