import java.util.*;
public class Arrays{
    public static void main(String args[]){
        int arr[] = new int[100];
        
         Scanner sc = new Scanner(System.in);

         arr[0] = sc.nextInt();
         arr[1] = sc.nextInt();
         arr[2] = sc.nextInt();

         System.out.println("math :" + arr[0]);
         System.out.println("phy :" + arr[1]);
         System.out.println("java :" + arr[2]);
    }
}