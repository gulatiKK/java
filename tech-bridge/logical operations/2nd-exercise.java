import java.util.*;
public class Main
{
    public static void main(String[] args){
        int age;
        int heartDisease;

        System.out.println("Choose 1 if the person has a heart disease");
        System.out.println("Choose 0 if the person doesn't have a heart disease");
        Scanner scan = new Scanner(System.in);
        System.out.println("How old is the person?");
        age = scan.nextInt();

        if (age < 15) {
            System.out.println("The person is not allowed");
        } 
        else if (age >= 15 && age < 45) {
            System.out.println("The person is allowed");
        }
        else if (age >= 45) {
            System.out.println("Do you have a heart disease? (0 or 1)");
            heartDisease = scan.nextInt();
            if (heartDisease==0) {
                System.out.println("The person is allowed");    
            } 
            
            else {
                System.out.println("The person is not allowed");    
            }
            
        }
    }
}