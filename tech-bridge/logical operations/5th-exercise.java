import java.util.*;
public class Main
{
    public static void main(String[] args){
        int code;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        code = scan.nextInt();

        if(code % 3 != 0 && code % 17 != 0){
            System.out.println("Your code is valid");
        }

        else{
            System.out.println("Your code is not valid");
        }
    }
}