import java.util.*; 
public class Main { 
public static void main(String args[]) { 
	int userInput;
    int a;
    int d;
    int s = 0;
    int cnt = 0; 
	Scanner sc=new Scanner(System.in); 
	System.out.println("What is the number?"); 
	userInput = sc.nextInt(); 
	a = userInput; 
	while(a > 0) 
	{ 
		a = a / 10; 
		++cnt; 
	} 
	a=userInput; 
	while(a>0) 
	{ 
		d =a % 10; 
		a=a/10; 
		s=s+(int)(Math.pow(d,cnt)); 
		cnt--; 
	} 
	if(s==userInput) 
		System.out.println( userInput + " is a Disarium number"); 
	else 
		System.out.println( userInput + " is not a Disarium number"); 
	} 
}