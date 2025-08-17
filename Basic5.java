package VariableDeclaration;

public class Basic5 {

    public static void main(String[]args){

        int a=10;
        int b=20;

        //Swapping using ^ operator.

        a = a^b;
        b = a^b; // b becomes original a
        a = a^b; // a becomes original b


        System.out.println("After swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
}
