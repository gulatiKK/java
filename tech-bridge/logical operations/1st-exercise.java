import java.util.*;
public class Main
{
    public static void main(String[] args){
        int userInput;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        userInput = scan.nextInt();

        if(userInput % 7 == 0 || userInput % 10 ==7 ){
            System.out.println(userInput + " is a buzz number");
        }

        else{
            System.out.println(userInput + " is not a buzz number");
        }
    }
}