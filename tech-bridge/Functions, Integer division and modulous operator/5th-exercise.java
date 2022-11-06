import java.util.*;

import javax.swing.filechooser.FileView;
public class Main
{
    public static void main(String[] args){
        int givenNumber;
        double rooted;
        double fv;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the number?");
        givenNumber = scan.nextInt();
        
        rooted = Math.sqrt(givenNumber);
        fv = Math.floor(rooted);

        if(rooted-fv == 0){
            System.out.println(givenNumber + " is a perfect square");
        }

        else{
            System.out.println(givenNumber + " is not a perfect square");
        }
    }
}