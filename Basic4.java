package VariableDeclaration;

//Perform swapping of two integers without using a temporary variable (using + and -, or ^ operator).

public class Basic4 {
    public static void main(String[]args){
        int a = 10;
        int b = 20;

        System.out.println("Before swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //Swapping using + and - operator.

        a = a+b; //a=30
        b = a-b; //b=10
        a = a-b; //a=20

        System.out.println("After swapping");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    
}


