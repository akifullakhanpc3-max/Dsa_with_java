package C13_Arrays;

import java.util.Arrays;

public class Trapping_RainWater {

    static void rain_water(int[] arr){
        //first 1left and right max element
        //loop
        //waterlevel = min(left max boundry,right max)
        //trapped water =waterlevel - height[i]
        //helping arr
        int[] left_max = new int[arr.length];
        int[] right_max=new int[arr.length];
        int waterlevel=0;
        int total_water_level = 0;

        left_max[0] =arr[0];
        for (int i = 1; i < right_max.length; i++) {
            if (left_max[i-1]>arr[i]) {
                left_max[i]= left_max[i-1];
            }else{
                left_max[i] = arr[i];
            }
        }
        
        right_max[right_max.length-1] =arr[arr.length-1];
        for (int i = right_max.length-2; i >= 0; i--) {
            if (arr[i]>right_max[i+1]) {
                right_max[i]= arr[i];
            }else{
                right_max[i]= right_max[i+1];
            }
        }
        System.out.println(Arrays.toString(left_max));
        System.out.println(Arrays.toString(right_max));

        for (int i = 0; i < arr.length; i++) {
            waterlevel = (Math.min(left_max[i], right_max[i]));
            total_water_level+= waterlevel-arr[i];
        }
        System.out.println(total_water_level);
    }

    public static void main(String[] args) {
        int[] arr= {4,2,0,6,3,2,5};
        rain_water(arr);
    }
}
