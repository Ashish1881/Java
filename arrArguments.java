public class arrArguments{
   public static void update(int arr[]){
    for(int i=0; i<arr.length; i++){
        arr[i] = arr[i] + 1;
    }
   }
   
    public static void main(String args[]){
        int arr[] = {98, 99, 89};
        update(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }
}