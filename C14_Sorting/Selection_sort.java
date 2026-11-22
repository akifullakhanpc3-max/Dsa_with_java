package C14_Sorting;

import java.util.Arrays;

public class Selection_sort {
    static void sort(int arr[]){
        

        for (int i = 0; i < arr.length-1; i++) {
            int min_position=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min_position]>arr[j]){
                    min_position = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min_position];
            arr[min_position]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {5,2,4,1,0,3};
        sort(arr);
    }
}
