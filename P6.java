// WAP to reverse a string.

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // to read user input
        System.out.print("Enter a string: ");
        String original = sc.nextLine();       // take input from user

        String reversed = "";                  // store reversed string

        // reverse the string manually
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println("Yes, it's a palindrome!");
        } else {
            System.out.println("No, it's not a palindrome.");
        }

        sc.close();  // close scanner
    }
}
