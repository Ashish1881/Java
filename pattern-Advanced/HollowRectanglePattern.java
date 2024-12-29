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
    public static void main(String args[]){
        pattern(4,4);
    }
}