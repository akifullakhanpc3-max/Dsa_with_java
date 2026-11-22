package C15_2DArrays.Questions;

import java.util.Arrays;

import C13_Arrays.printing2DArray;

public class Frequency {
    static int frequency(int arr[][],int key){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        int key = 7;
        System.out.println(frequency(arr, key));
        printing2DArray.print(arr);
    }    
}
