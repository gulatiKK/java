import java.util.Scanner;

public class Main {

	
	static int Series(int n)
	{
        int userInput = 0;
        n = userInput; 
		int i;
		int sums = 0;
		for (i = 2; i <= n; i++)
			sums += (1 / i * i);
		return sums;
	}

	
	public static void main(String[] args)
	{
		int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        n = scan.nextInt();

		int res = Series(n);
		System.out.println(res);
	}
}