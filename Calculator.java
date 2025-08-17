import java.util.*;

public class Calculator {
    public static void main(String args[]){
        System.out.println("Enter two Numbers:-");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = sc.nextDouble();
        System.out.println("Enter second number:");
        double b = sc.nextDouble();
        
        System.out.println("Choose Operations");
        System.out.println( "1: + (ADDITION)");
        System.out.println( "2: - (SUBTRACTION)");
        System.out.println( "3: * (MULTIPLICATION)");
        System.out.println( "4: / (DIVISION)");
        System.out.println( "5: % (MODULO)");
        

        int choice = sc.nextInt();
        double result = 0;
        boolean valid = true;

        switch(choice){
            
            case 1:
            result = a+b;
            break;
            
            case 2:
            result = a-b;
            break;
            
            case 3:
            result = a*b;
            break;
            
            case 4:
            result = a/b;
             if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
            break;
            
            case 5:
            result = a%b;
             if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
            break;
            default:
            System.out.println("Invalid Input");
            valid = false;
        }
        if (valid){
            System.out.println("Result = " + result);
        }
        sc.close();
        }        
}

    

