package C14_Sorting;

import java.util.Arrays;

public class Bubbl_sort {
    static int[] sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3, 0 };
        System.out.println(Arrays.toString(sort(arr)));
    }
}
