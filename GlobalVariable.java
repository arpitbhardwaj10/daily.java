package VariableDeclaration;

public class GlobalVariable {
    static double a = 90.5;
    
    //GlobalVariable
    //(A variable declared inside a class block and can be accessed anywhere within the class, It has default values.)

    public static void main(String[]args){
        int a = 25;
        System.out.println(GlobalVariable.a);
    }
    
}
