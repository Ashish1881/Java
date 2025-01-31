
import java.util.*;

public class selection{
    public static void selectionSort(int arr[]){
        for(int i=0;  i<arr.length-1; i++){
            int minPos = i; 
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]< arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct  posgition to insert
            while(prev >= 0 && arr[prev] >curr){
                arr[prev+1] =  arr[prev];
                prev--;

            }
            // i
        }
    }
    public static void print(int arr[]){
    for(int i = 0; i<arr.length; i++ ){
        System.out.print(arr[i]);
    }
    System.out.println();
   }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count [] = new int [largest + 1];
        for(int i = 0 ; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j =0; 
        for(int i =0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--; 
            }
        }
        
    }

    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        // selectionSort(arr);
        // Arrays.sort(arr);
        countingSort(arr);

        print(arr);
    }
}