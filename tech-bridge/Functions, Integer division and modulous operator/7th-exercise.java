import java.util.*;
public class Main
{
    public static void main(String[] args){
        int givenNumber;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        givenNumber = scan.nextInt();

        if(givenNumber % 111 == 0){
            System.out.println(givenNumber + " is a nelson number");
        }

        else{
            System.out.println(givenNumber + " is not a nelson number");
        }
    }
}