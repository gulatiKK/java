import java.util.*;
public class Main {
    public static void main(String[] args) {
        int num = 0;
        int number;
        int temp;
        int  total = 0;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?");
        number = scan.nextInt();

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
  }
}