import java.util.*;
public class Main {
    public static void main(String[] args) {
        int num;
        int c = 0;
        int temp;
        int lastSquareDigits;
        int sqr;

        Scanner in = new Scanner(System.in);
        System.out.println("What is the number?");
        num = in.nextInt();
 
        c = 0;
        sqr = num*num;
        temp =num;
 
        while(temp>0){
            c++;
            temp=temp/10;
        }
 
        lastSquareDigits = (int) (sqr%(Math.pow(10,c)));
 
        if(num == lastSquareDigits)
            System.out.println(num + " is an automorphic number");
        else
            System.out.println(num + " is not an Automorphic number");
    }
  }