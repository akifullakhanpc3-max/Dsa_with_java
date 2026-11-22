package C13_Arrays;

import java.util.Arrays;

public class Rev_array {
    static void rev(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp  = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        // Arrays.toString(arr);
        // for (int j2 = 0; j2 < arr.length; j2++) {
        //     System.out.print(arr[j2]+" ");
        // }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        rev(arr);
    }
}
