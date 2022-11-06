import java.util.*;
class CodeGenerator
{
    void PrintFuncSignature(String function_name, String function_return_type , String[] function_arguments)
    {
        System.out.print(function_return_type + " " + function_name + "(" );
        PrintFuncArgs(function_arguments);
        

        System.out.print(")\n");
    }
    void PrintFuncArgs( String[]  function_arguments)
    {
        int x = 0;
        int lengthOfArguments = function_arguments.length;
        lengthOfArguments--;

        while(lengthOfArguments > x)
        {
            System.out.print(function_arguments[x] + " ");
            x++;
            if(lengthOfArguments == x )
            {
                System.out.print(function_arguments[x]);
            }
            else
            {
                System.out.print(function_arguments[x] + ", ");
                x++;
            }
        } 
    }

    void PrintFunctionBody(String function_return_type)
    {
        System.out.print("{\n\t"); 
        String value = "\"Hello\"";
        if ( function_return_type == "int"){
            value = "0";
        }

        else if(function_return_type == "boolean"){
            value = "false";
        }

        else if(function_return_type == "double"){
            value = "0.0";
        }

        else if(function_return_type == "float"){
            value = "0.0f";
        }
        System.out.print(function_return_type + " result = " + value + "; \n\t");
        System.out.print("return result;\n");  
        System.out.print("}\n\t");   
    }

    void PrintTestFuncSignature(String function_name, String function_arguments[]){
        System.out.println(" ");
        System.out.print("void test_" + function_name + "(");
    }

    void PrintTestFuncBody(String function_return_type, String function_name, String function_arguments[]){
        int lengthOfArguments = function_arguments.length;
        int x = 0;
        lengthOfArguments--;
        while(lengthOfArguments > x)
        {
            System.out.print(function_arguments[x] + " ");
            x++;
            if(lengthOfArguments == x )
            {
                System.out.print(function_arguments[x]);
            }
            else
            {
                System.out.print(function_arguments[x] + ", ");
                x++;
            }
        } 
        System.out.print(", boolean expected_result)\n");
        System.out.print("{\n");
        //System.out.print(function_arguments[0] + " " + function_arguments[1] + ", " + function_arguments[2] + " " + function_arguments[3] + ", " + function_arguments[4] + " " + function_arguments[5] + ", " + function_return_type + " expected_result" + ")\n");
        System.out.print("boolean actual_result(");
        lengthOfArguments = function_arguments.length;
        x = 0;
        lengthOfArguments--;
        while(lengthOfArguments > x)
        {
            x++;
            if(lengthOfArguments == x )
            {
                System.out.print(function_arguments[x]);
                break;
            }
            System.out.print(function_arguments[x] + " ");
            
                x+=2;
                System.out.print(function_arguments[x] + ", ");
                x++;
          
        } 
        System.out.print(");\n\n");
        System.out.print("String test_status = " + "\"Failed\";\n");
        System.out.print("if (actual_result == expected_result)\n");
        System.out.println("{\n");
        System.out.println("test_status = \"Passed\";\n");
        System.out.println("}\n\n");
    }

    void PrintSuiteFuncSignature(String function_arguments[]){
        System.out.println("StringBuilder builder = new StringBuilder(test_status);\n");
    }

    void PrintSuiteFuncBody(String function_arguments[]){
        int x = 1;
        
        int y = function_arguments.length;
        x = 1;
        while(x <= y)
        {
            System.out.print("builder.append(\"" + function_arguments[x] + " ->\");\n");
            System.out.print("builder.append(" + function_arguments[x] + ");\n");
            x = x + 2;
        }
        
        System.out.print("builder.append(\":expected_result -> \");" + "\n" + "builder.append(expected_result);" + "\n");
        System.out.print("builder.append(\":actual_result -> \");" + "\n" + "builder.append(actual_result);" + "\n");
        System.out.print("System.out.println(builder);" + "\n" + "}" + "\n");
    }

    void PrintSuiteTest(String function_name){
        System.out.print("void suite_test_" + function_name + "()\n");
        System.out.println("{\n");
        System.out.println("test_" + function_name + "(0, \"Hello\", 0.0, false);\n");
        System.out.println("}");
    }

   void PrintCode(String function_name, String function_return_type , String[] function_arguments)
   {
        PrintFuncSignature(function_name, function_return_type, function_arguments);
        PrintFunctionBody(function_return_type);
        PrintTestFuncSignature(function_name, function_arguments);
        PrintTestFuncBody(function_return_type, function_name, function_arguments);
        PrintSuiteFuncSignature(function_arguments);
        PrintSuiteFuncBody(function_arguments);
        PrintSuiteTest(function_name);
   }  

public class CG
{
    public static void main(String[] args)
    {
        String fname;
        String rettype;
        String[] arguments;
        int numOfArguments;

        Scanner scan = new Scanner(System.in);
        System.out.print("What is the function name?");
        fname = scan.nextLine();
        System.out.print("What is the function return type?");
        rettype = scan.nextLine();
        System.out.print("How many arguments are there?");
        numOfArguments = scan.nextInt();
        do{

        }while (arguments[] == numOfArguments)
        CodeGenerator cgen = new CodeGenerator();
        cgen.PrintCode(fname, rettype, arguments);
    }                                                      
}
}