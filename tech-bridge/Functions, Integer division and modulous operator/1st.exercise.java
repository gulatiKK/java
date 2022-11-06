import java.util.*;
public class Main
{
    public static void main(String[] args){
        int year;
        System.out.println("What is the year?");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
  
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
           System.out.println("It is a leap year");
        else
           System.out.println("It is not a leap year");
    }
}