//Reversing a string.
public class P8 {
    public static void main(String[] args){

        String input = "orpiw";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String:" +input);
        System.out.println("Reversed String:" +reversed);


    }
    
}
