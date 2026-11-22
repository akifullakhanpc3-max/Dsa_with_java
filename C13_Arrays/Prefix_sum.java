package C13_Arrays;

import java.util.Arrays;

public class Prefix_sum {
    static void prefixSum(int arr[]){
        int prefix[]= new int[arr.length];
        prefix[0]= arr[0];

        int max=0;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] =  prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
        //prefix formula = p[end] - p[start-1] 
        int current_sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                current_sum =  i==0? prefix[j]:prefix[j]-prefix[j-1];
                if(max<current_sum){
                    max = current_sum;
                }
            }

        }
        System.out.println(max);
    }
    
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        prefixSum(arr);
    }
}
