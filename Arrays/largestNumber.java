import java.util.*;
public class largestNumber{
   public static int largestNum(int numbers[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int i=0; i<numbers.length; i++){
        if(largest < numbers[i]){
            largest = numbers[i];
        }
        if(smallest > numbers[i]){
            smallest = numbers[i];
        }
        
    }
    System.out.println("smallest value is :" + smallest);
    return largest;
   }
   
    public static void main(String args[]){
        int numbers[] = {1,5,4,12,8,6};
        System.out.print("largest value  is :" + largestNum(numbers));
    }
}