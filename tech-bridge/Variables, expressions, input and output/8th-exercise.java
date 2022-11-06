import java.util.*;
public class Main
{
    public static void main(String[] args){
        int baseNumber;
        int multiplier;
        
        Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number for the table: ");

			int n = sc.nextInt();
			for (multiplier=1;multiplier<=10;multiplier++){
				 baseNumber = n * multiplier;
				System.out.println(n + "*"+ multiplier + " = " + baseNumber);	
			}
    }
    }