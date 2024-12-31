
public class linerSerch{
    public static int linerSerchs(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]= {10,20,30,40,50,60,70,80,90,100};
        int key = 500;

        int index = linerSerchs(num, key);
        if(index == -1){
            System.out.print("Not found");
        }else{
            System.out.print("key is at index :" + index );
        }
    }
}