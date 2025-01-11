import java.util.*;
public class bubbleSort{
   public static void bubble(int arr[]){
    for(int turn = 0; turn<arr.length-1; turn++){
        for(int j=0; j<arr.length-1-turn; j++){
            
           if(arr[j] > arr[j+1]){
             //swap
            int teamp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = teamp;
           }
        }
    }
   }
   public static void print(int arr[]){
    for(int i = 0; i<arr.length; i++ ){
        System.out.print(arr[i]);
    }
    System.out.println();
   }
    public static void main(String args[]){
        int arr[] = {1,4,3,2,5};
        bubble(arr);
        print(arr);
    }
}