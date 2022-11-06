import java.util.*;

import javax.swing.filechooser.FileView;
public class Main
{
    public static void main(String[] args){
        int givenNumber;
        int realNumber;
        double rooted;
        double fv;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        givenNumber = scan.nextInt();
        
        realNumber = givenNumber + 1;
        rooted = Math.sqrt(realNumber);
        fv = Math.floor(rooted);

        if(rooted-fv == 0){
            System.out.println(givenNumber + " is a sunny number");
        }

        else{
            System.out.println(givenNumber + " is not a sunny number");
        }
    }
}