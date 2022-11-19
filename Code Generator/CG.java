import java.util.*;
import logic.CodeGenerator;
public class CG
{
    public static void main(String[] args)
    {
        String [] arguments;
        String fname;
        String rettype;
        int numOfArguments;

        Scanner scan = new Scanner(System.in);
        System.out.print("What is the function name?");
        fname = scan.nextLine();
        System.out.print("What is the function return type?");
        rettype = scan.nextLine();
        System.out.print("How many arguments are there?");
        numOfArguments = scan.nextInt(); 
        arguments  = new String[numOfArguments * 2];
        for(int i = 0; i<numOfArguments*2; i+=2)
        {
            System.out.print("What is the argument name?");
            arguments[i+1] = scan.next();
            System.out.print("What is the argument return type?");
            arguments[i] = scan.next();
        }
        
        CodeGenerator cgen = new CodeGenerator(fname, rettype, arguments);
        String code = cgen.getCode();
        System.out.println(code);
     }                                                      
}
