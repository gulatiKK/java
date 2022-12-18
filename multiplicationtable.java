import java.util.*;
public class multiplicationtable {
    public static void main(String[] args){
        int num;
        int a = 1;
        int product;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        num = scan.nextInt();

        while(a <= 10){
            product = num * a;
            System.out.println(product);
            a++; 
        }
    }
}
