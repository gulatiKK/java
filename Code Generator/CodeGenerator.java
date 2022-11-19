package logic;
public class CodeGenerator
{
    private String function_name;
    private String function_return_type;
    private String[] function_arguments;
    private String code;

    public CodeGenerator(String function_name, String function_return_type, String[] function_arguments)
    {
        this.function_name = function_name;
        this.function_return_type = function_return_type;
        this.function_arguments = function_arguments;
        this.code = "";

    }
    public String getCode ()
    {
        PrintFuncSignature(function_name, function_return_type, function_arguments);
        PrintFunctionBody(function_return_type);
        PrintTestFuncSignature(function_name, function_arguments);
        PrintTestFuncBody(function_return_type, function_name, function_arguments);
        PrintSuiteFuncSignature(function_arguments);
        PrintSuiteFuncBody(function_arguments);
        PrintSuiteTest(function_name);
        return code;
    }
    void PrintFuncSignature(String function_name, String function_return_type , String[] function_arguments)
    {
        code+= function_return_type + " " + function_name + "(";
        PrintFuncArgs(function_arguments);
        
        code += ")\n";
    }
    void PrintFuncArgs( String[]  function_arguments)
    {
        int x = 0;
        int lengthOfArguments = function_arguments.length;
        lengthOfArguments--;

        while(lengthOfArguments > x)
        {
            code += function_arguments[x] + " ";
            x++;
            if(lengthOfArguments == x )
            {
                code += function_arguments[x];
            }
            else
            {
                code += function_arguments[x] + ", ";
                x++;
            }
        } 
    }

    void PrintFunctionBody(String function_return_type)
    {
        code += "{\n\t"; 
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
        code += function_return_type + " result = " + value + "; \n\t";
        code += "return result;\n";  
        code += "}\n\t";   
    }

    void PrintTestFuncSignature(String function_name, String function_arguments[]){
        code += " ";
        code += "void test_" + function_name + "(";
    }

    void PrintTestFuncBody(String function_return_type, String function_name, String function_arguments[]){
        int lengthOfArguments = function_arguments.length;
        int x = 1;
        lengthOfArguments--;
        while(lengthOfArguments <= x)
        {
            code += function_arguments[x] + " ";
            x++;
            if(lengthOfArguments == x )
            {
                code += function_arguments[x];
            }
            else
            {
                code += function_arguments[x] + ", ";
                x++;
            }
        } 

        code += "boolean expected_result)\n";
        code += "{\n";
        code += function_return_type + " actual_result = " + function_name + "(";
        lengthOfArguments = function_arguments.length;
        x = 1;
        lengthOfArguments--;
        while(lengthOfArguments > x)
        {
            // x++;
            if(lengthOfArguments == x )
            {
                code += function_arguments[x];
                break;
            }
            code += function_arguments[x] + ", ";
                x+=2;
                code += function_arguments[x];
                x = x+2;
        } 

        code += ");\n\n";
        code += "String test_status = " + "\"Failed\";\n";
        code += "if (actual_result == expected_result)\n";
        code += "{\n";
        code += "test_status = \"Passed\";\n";
        code += "}\n\n";
    }

    void PrintSuiteFuncSignature(String function_arguments[]){
        code += "StringBuilder builder = new StringBuilder(test_status);\n";
    }

    void PrintSuiteFuncBody(String function_arguments[]){
        int x = 1;
        
        int y = function_arguments.length;
        x = 1;
        while(x <= y)
        {
            code += "builder.append(\"" + function_arguments[x] + " ->\");\n";
            code += "builder.append(" + function_arguments[x] + ");\n";
            x = x + 2;
        }
        
        code += "builder.append(\":expected_result -> \");" + "\n" + "builder.append(expected_result);" + "\n";
        code += "builder.append(\":actual_result -> \");" + "\n" + "builder.append(actual_result);" + "\n";
        code += "System.out.println(builder);" + "\n" + "}" + "\n";
    }

    void PrintSuiteTest(String function_name){
        code += "void suite_test_" + function_name + "()\n";
        code +="{\n";
        code +="test_" + function_name + "(0, \"Hello\", 0.0, false);\n";
        code +="}";
    }
}
