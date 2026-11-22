package C14_Sorting.Decending_sort;

import java.util.Arrays;

public class Sorting {
    static void bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void selecetion_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max_position = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max_position]) {
                    max_position = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_position];
            arr[max_position] = temp;
        }
        // System.out.println(Arrays.toString(arr));
    }

    static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int max_element = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < max_element) {
                    arr[prev + 1] = arr[prev];
                    prev--;
                
            }
            arr[prev + 1] = max_element;
        }
    }

    static void count_sort(int arr[]){
        int max_element=0;
        for (int i = 0; i < arr.length; i++) {
            if (max_element<=arr[i]) {
                max_element=arr[i];
            }
            // max_element = Math.max(max_element, arr[i]);
        }
        // System.out.println(max_element);
        int count[]= new int[max_element+1];
        // System.out.println(count.length);
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            
        }
        System.out.println(Arrays.toString(count));
        int j=0;
        for (int i = count.length-1; i >=0; i--) {
                while (count[i]>0) {
                    arr[j]=i;
                    j++;
                    count[i]--;
            }            
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = { 4,2, 2, 3, 1, 5 };
        System.out.println(Arrays.toString(arr));
        // bubble_sort(arr);
        // selecetion_sort(arr);
        // insertion_sort(arr);
        count_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
