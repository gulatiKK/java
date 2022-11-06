import java.util.*;
public class Main
{
    public static void main(String[] args){
        double percentage = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the student percentage?");
        percentage = scan.nextDouble();

        if (percentage>90){
            System.out.println("The grade is A");
        }

        else if(percentage>80 && percentage<89){
            System.out.println("The grade is B");
        }

        else if (percentage>70&&percentage<79){
            System.out.println("The grade is C");
        }

        else if(percentage>60&&percentage<69){
            System.out.println("The grade is D");
        }

        else if(percentage>50&&percentage<59){
            System.out.println("The grade is E");
        }

        else if(percentage<50){
            System.out.println("The grade is F");
        }

        else{
            System.out.println("Please give a valid percentage");
        }
    }
}