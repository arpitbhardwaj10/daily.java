package TypeCasting;

//Narrowing: The process of converting larger range datatype into smaller range datatype.

public class Demo2 {
    public static void main(String[]args){
        double a = 76.81;
        int b = (int)a;
        System.out.println(a+" "+b);
        System.out.println("____________");

        int c = 68;
        char d = (char)c;
        System.out.println(c+" "+d);
        System.out.println("____________");

        float i = 58.7658f;
        long j = (long)i;
        System.out.println(i+" "+j);
        System.out.println("____________");

        double e = 101.089;
        char ch = (char)e;
        System.out.println(e+" "+ch);


    }
    
}
