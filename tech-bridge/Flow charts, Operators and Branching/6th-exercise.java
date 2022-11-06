import java.util.*;
public class Main
{
    public static void main(String[] args){
        double fixedPrice;
        double electricity;
        double charges;
        double cost;

        fixedPrice = 100;

        Scanner scan = new Scanner(System.in);
        System.out.println("How many units did you use?");
        electricity = scan.nextDouble();

        if (electricity<100){
            cost = 100 + electricity * 6.30;
            System.out.println(cost);
        }

        else if(electricity>100 && electricity<200){
        cost = 100 + 100 * 6.30 + (electricity - 100) * 6.85;
        System.out.println(cost);
    }

        else if(electricity>200){
            cost = 100 + 100 * 6.30 + 100 * 6.85 + (electricity-200) * 7.40;
            System.out.println(cost);
        }
    }
}