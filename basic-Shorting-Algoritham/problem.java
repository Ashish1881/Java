import java.util.*;
public class problem{
    public static void bubble(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // the programam of selection sort

    public static void selection(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            int minPos = turn; 
            for(int j=turn+1;  j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void print(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        // bubble(arr);
        selection(arr);
        print(arr);
    }
}