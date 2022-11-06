public class Main{
    public static int GetEffectiveMonths(int numDays){
        int months = numDays / 30;
        int extraDays = numDays % 30;

        if (extraDays > 9){
            months = months+1;
        }

        return months;
    }
    public static void main(String[] args){
        System.out.println("Effective months for 7 days: ");
        System.out.println(GetEffectiveMonths(7));

        System.out.println("Effective months for 10 days: ");
        System.out.println(GetEffectiveMonths(10));

        System.out.println("Effective months for 30 days: ");
        System.out.println(GetEffectiveMonths(30));

        System.out.println("Effective months for 45 days: ");
        System.out.println(GetEffectiveMonths(45));

        System.out.println("Effective months for 110 days: ");
        System.out.println(GetEffectiveMonths(110));
    }
}