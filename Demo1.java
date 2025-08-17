package TypeCasting;

//The Process of converting one datatype to an another datatype is called TypeCasting. (for eg int--float).

//Widening TypeCasting: process of converting smaller range datatype to larger range datatype.

public class Demo1 {
    
    public static void main(String[]args){
        char a = 'A';
        int b = a;
        System.out.println(a+" "+b);

        System.out.println("_____________");

        int c = 23;
        double d = c;
        System.out.println(c+" "+d);

        System.out.println("_____________");


        char x = 'd';
        double y = x;
        System.out.println(x+" "+y);

        System.out.println("_____________");

    }
}
