class CodeGenerator1{
   void PrintCode(String function_name , String function_return_type , String[] function_arguments)
   {
       System.out.println("Sup kid");
   }
}    
    public class CG2
    {
        public static void main (String[] args)
        {
            String fname = "dummy";
            String rettype = "boolean";
            String[] arguments = {"int" , "arg1" , "String" , "arg2" , "double" , "arg3"};

            CodeGenerator cgen = new CodeGenerator();
            cgen.PrintCode(fname, rettype, arguments);
        }
    }


    System.out.print("builder.append(\"  :" + function_arguments[x] + " -> \");" + "\n");

    String fname = "myfunc";
    String rettype = "int";
    String[] arguments = {"int" , "arg1" , "String" , "arg2" , "double" , "arg3"};