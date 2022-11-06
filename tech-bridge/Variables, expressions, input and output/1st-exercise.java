import java.util.*;
public class Main{
    public static int GetEffectiveMonths(int numDays, int type){
        int months = numDays / 30;
        int extraDays = numDays % 30;

        if(extraDays > 15){
            months = months + 1;
        }

        else if(extraDays > 9 && type != 2){
            months = months + 1;
        }

        return months;
    }
    public static void CalculateAndPrintInterest(){
        double amount;
        double rateofinterest = 0;
        int days, months;
        double interest;
        int borrowerType = 0;

        System.out.println("Choose borrower number 1 if the person has never borrowed money before");
        System.out.println("Choose borrower 2 if the person has borrowed money before and returns in time");
        System.out.println("Choose borrower 3 if the person has borrowed mony before and doesn't pay back in time");
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money are you landing:");
        amount = scan.nextDouble();
        System.out.println("What is the type of borrower?");
        borrowerType = scan.nextInt();
        System.out.println("How many days you are landing the money for:");
        days = scan.nextInt();
        months = GetEffectiveMonths(days, borrowerType);

        if (borrowerType == 1)
        {
            rateofinterest = 1.8;
        }

        else if(borrowerType == 2)
        {
            rateofinterest = 1.2;
        }

        else if(borrowerType ==3)
        {
            rateofinterest = 2.5;
        }

        else {
            System.out.println("Please specify a valid borrower type!");
        }
        interest = amount*rateofinterest*months/100;
        System.out.println("The expected interest is " + interest);
    }

    public static void main(String[] args){
        int tokens;

        Scanner scan = new Scanner (System.in);
        System.out.println("How many tokens were distributed today?");
        tokens = scan.nextInt();

        for (int executionCount = 0; executionCount < tokens; executionCount++){
            CalculateAndPrintInterest();
        }
    }
}