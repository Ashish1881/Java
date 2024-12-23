// public class javaBasics {
//     public static void main (String args[]) {
//         System.out.print("Hello word\n"); // \n means next line
//         System.out.println("Hello word");
//         System.out.println("Hello word");
//         System.out.println("Hello word"); // ln means also next line 
//     }
// }
// This is a boilerplate code 

// public class javaBasics{
//     public static void main (String args[]){
//         System.out.print("****\n");
//         System.out.print("***\n");
//         System.out.print("**\n");
//         System.out.print("*\n");
//     }
// }
// import java.util.*;

// public class javaBasics{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);  
//         // String name = sc.next();
//         // System.out.print(name);

//         // String name = sc.nextLine();  // if you write more sentece when you use nextLine keyword
//         // System.out.print(name);

//         // Boolean follow = sc.nextBoolean();
//         // System.out.print(follow);

//         // Short num = sc.nextShort();
//         // System.out.print(num);

//         Long num = sc.nextLong();
//         System.out.print(num);
//     }
// }

// import java.util.*;

// public class javaBasics{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.print(sum);
//     }
// }

// import java.util.*;

// public class javaBasics {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = a * b;
//         System.out.print(product);
//     }
// }


// import java.util.*;

// public class javaBasics {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);

//         Double p = 3.14;
//         Float rad = sc.nextFloat();
//         Double area = p*rad*rad;

//         System.out.print(area);

//     }
// }

// import java.util.*;

// public class javaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int side = sc.nextInt();
//         int area = side * side;

//         System.out.print(area);
//     }
// }

// import java.util.*;

// public class javaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Pencil :");
//         Float pencil = sc.nextFloat();
        
//         System.out.print("Pen :");
//         Float pen = sc.nextFloat();

//         System.out.print("Eraser :");
//         Float Eraser = sc.nextFloat();
        
//         Float total = (pencil + pen + Eraser);

//         Float gst = (total*18)/100;

//         Float totalCost = total + gst;

//         System.out.print("Total item :");
//         System.out.println(total);

//         System.out.print("GSt :");
//         System.out.println(gst);

//         System.out.print("Total Cost is :");
//         System.out.println(totalCost);
//     }
// }


// import java.util.*;

// public class javaBasics{
//     public static void main(String args[]){
//         int x = 2, y = 5;

//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));

//         System.out.print(exp1 + ",");
//         System.out.print(exp2);
//     }
// }

// import java.util.*;

// public class javaBasics{
//     public static void main(String args[]){
//         int x = 200, y = 50, z = 100;
//     if(x > y && y > z){
//         System.out.println("Hello");
//     }
//     if(z > y && z < x){
//         System.out.println("Java");
//     }
//     if((y+200) < x && (y+150) < z){
//         System.out.println("Hello Java");
//     }

       
//     }
// }

// import java.util.*;
// public class javaBasics {
//     public static void main(String args[]){
//          int x, y, z;
//      x = y = z = 2;
//      x += y;
//      y -= z;
//      z /= (x + y);
//     System.out.println(x + " " + y + " " + z);
//     }
// }
       
//   import java.util.*;
//   public class javaBasics{
//     public static void main(String args[]){
//         String a = "*";
//         for(int i = 5; i <= 0; i--){
//             for(int j = 0 ; j < i; j++){
//                 System.out.print(a);
//             }
//             System.out.print(a);
//         }
          
//         }
//     }

//   import java.util.*;
//   public class javaBasics{
//     public static void main(String args[]){
//         String a = "*";
//         for(int i = 1 ; i <= 5 ; i++ ){
//             System.out.println(a);
//             a = a + "*";
//         }
          
//         }
//     }  this is a solution
  
  import java.util.*;
  public class javaBasics{
    public static void main(String args[]){
        String a = "*";
        for(int c = 0; c <= 5 ; c++ ){
            for(int r = 5; r > 0 ; r--){
                System.out.println(a);
                a += "*";
            }
        }
          
        }
    }  