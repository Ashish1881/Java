import java.util.*;

public class trappedRainWater{
    public start int trappedRainWat(int height[]){
        //calculate left max boundary - array
        int n = height.length;
        int leftMax[] = new int [height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[]= new int[height.length];
        rightMax[n-1] = height[height.length-1];
        // loop
        //waterLevel = min(leftmax bound, rightmax bound)
        // trapped water = waterLevel - height[i]   
    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

    }
}