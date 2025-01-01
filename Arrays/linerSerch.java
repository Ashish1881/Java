
// public class linerSerch{
//     public static int linerSerchs(int num[], int key){
//         for(int i=0; i<num.length; i++){
//             if(num[i] == key){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static String menus(String menu[], String keys){
//         for(int i=0; i<menu.length; i++){
//             if(menu[i] == keys){
//                 return (String)i;
//             }
//         }
//         return (String)-1;
//     }
//     public static void main(String args[]){
//         // int num[]= {10,20,30,40,50,60,70,80,90,100};
//         // int key = 500;
//         String menu ={"Biriyani", "Samosa ","Falooda"};
//         String keys = "Samosa";

//         // int index = linerSerchs(num, key);
//         // if(index == -1){
//         //     System.out.print("Not found");
//         // }else{
//         //     System.out.print("key is at index :" + index );
//         // }
//         int index = menus(menu ,keys);
//         if(index == -1){
//             System.out.print("Not found");
//         }else{
//             System.out.pirnt("Key is at index :" + keys );
//         }


//     }
// }

public class LinearSearch {
    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int menuSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) { // Use .equals() for string comparison
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // Integer array example
        // int num[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // int key = 50;

        String menu[] = { "Biriyani", "Samosa", "Falooda" };
        String key = "Samosa";

        // Example with integer array
        // int index = linearSearch(num, key);
        // if (index == -1) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("Key is at index: " + index);
        // }

        // Example with string array
        int index = menuSearch(menu, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
