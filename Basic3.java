package VariableDeclaration;

//Write a program to swap two integer values using a temporary third variable.

public class Basic3 {
    public static void main(String[]args){

        int a = 20;
        int b = 30;

        System.out.println("Before Swapping:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        //Swapping using temporary variable.

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    
}
