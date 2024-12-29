public class HollowRectanglePattern{
    public static void pattern(int toRos , int toCol){
        // outer loop
        for(int i = 1; i <= toRos ; i++){
            // inner Columns
            for(int j = 1 ; j <= toCol; j++){
                // Cell (i,j)
                if(i == 1 || i == toRos || j == 1 || j == toCol){
                    // boundary cells 
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
   
   public static void inverted_rotated_half_pyaramid(int n){
    for(int i=1;  i<=n; i++){
        // ourter

        for(int j=1; j<=n-1; j++){
            System.out.print(" ");
        }

        //Stars 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        System.out.println();
   
    }
 }

 public static void numprint(int n){
    for(int i=1; i<=n; i++){
        
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
 }

 public static void number(int n){
    int num = 1;
    for(int i=1; i<=n ; i++){
        for(int j=1; j<=i ; j++){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
 }

 public static void zero_one_pattern(int n) {
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j) % 2 == 0){
                System.out.print("1"+" ");
            }else{
                System.out.print("0"+" ");
            } 
                                                                                               
        }
        System.out.println(); 
    }
 }
        
    public static void main(String args[]){
        // pattern(4,4);
       // inverted_rotated_half_pyaramid(5);
    //    numprint(5);
        //   number(5);
        zero_one_pattern(5);

    }
}