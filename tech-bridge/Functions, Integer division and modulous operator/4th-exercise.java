import java.util.*;
public class Main
{
    public static void main(String[] args){
        int givenNumber;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        givenNumber = scan.nextInt();

        if(givenNumber % 2 == 0){
            System.out.println(givenNumber + " is an even number");
        }

        else{
            System.out.println(givenNumber + " is an odd number");
        }
    }
}