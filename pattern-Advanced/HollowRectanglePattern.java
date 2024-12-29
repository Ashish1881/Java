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

    public static void butterfly(int n){
        // 1st half
        for(int i=1; i<=n; i++){
            
            
            //Stars -1
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces -2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars -i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--){
            //Stars -1
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces -2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars -i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }     

    public static void solid_Rhombus(int n){
        for(int i=1; i<=n ; i++){
            
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n ; j++){
                if(i == 1 || i==n || j==1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        public static void diamond(int n){
            for(int i=1; i<=n; i++){    
                // space
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }

                // stars
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
           for(int i=n; i>=1; i--){    
                // space
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }

                // stars
                for(int j=1; j<=(2*i)-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            } 
        }
        
    public static void main(String args[]){
        // pattern(4,4);
       // inverted_rotated_half_pyaramid(5);
        // numprint(5);
        //   number(5);
        // zero_one_pattern(5);
        // butterfly(5);
        // solid_Rhombus(5);
        // hollow_rhombus(4);
        diamond(7`);

    }
}
