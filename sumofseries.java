import java.util.*;
public class sumofseries {
    public static void main(String[] args){
        int ans = 0;
        int num;
        int x = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        num = scan.nextInt();

        while(num > 0){
            ans = x + num;
            x = x + num;
            num --;
        }

        System.out.println(ans);
    }
}