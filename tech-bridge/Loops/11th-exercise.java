import java.util.*;

public class Main {
	
	static int digSum(int n)
	{
		int sum = 0;

		while (n > 0 || sum > 9)
		{
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	
	public static void main(String argc[])
	{
		int n;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number?"); 
        n = scan.nextInt();

		System.out.println(digSum(n));
	}
}


