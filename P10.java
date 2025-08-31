//Find Seconf highest number
public class P10 {
    public static void main(String[] args){
        int[] arr = {1,72,13,84,65,16};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if (num > largest){
                secondLargest = largest;
                largest =num;
            }else if(num > secondLargest && num != largest){
                secondLargest =num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("No second largest element found:");
        }else{
            System.out.println("second largest element:" + secondLargest);
        }
    }   
}
