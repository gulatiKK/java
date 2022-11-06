import java.util.Scanner;

public class Main
{
static void printAP(int a, int d, int n)
{
	int curr_term;
    curr_term = a;
	for (int i = 1; i <= n; i++)
	{ System.out.print(curr_term + " ");
	curr_term =curr_term + d;
	
	}
}

public static void main(String[] args)
{

        int startTerm;
        int difference;
        int numberOfTerms;

        Scanner scan = new Scanner (System.in);
        System.out.println("What is the number that should start the sequence?");
        startTerm = scan.nextInt();
        System.out.println("What should be the difference between the terms?");
        difference = scan.nextInt();
        System.out.println("How many terms should be printed?");
        numberOfTerms = scan.nextInt();

        printAP(startTerm, difference, numberOfTerms);
}
}

