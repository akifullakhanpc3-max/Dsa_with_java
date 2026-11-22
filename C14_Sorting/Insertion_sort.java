package C14_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion_sort {
    static void sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr =arr[i];
            int prev=i-1;

            while (prev>=0 && curr < arr[prev]) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        sort(arr);
    }
}
