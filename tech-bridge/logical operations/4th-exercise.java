import java.util.*;
public class Main
{
    public static void main(String[] args){
        int code;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the code?");
        code = scan.nextInt();

        if(code>=1000 && code<10000 && code % 3 == 0 && code % 13 ==0 || code>=1000 && code<10000 && code % 5 == 0 && code % 17 ==0 ){
            System.out.println("The code is valid");
        }

        else{
            System.out.println("Invalid code, try again");
        }
    }
}