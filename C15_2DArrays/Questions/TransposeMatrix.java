package C15_2DArrays.Questions;

import C13_Arrays.printing2DArray;

public class TransposeMatrix {
    static void transpose(int arr[][]){
        int row = arr.length;
        int column = arr[0].length;
        
        int transpose[][] = new int [column][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // if (i==j) {
                //     continue;
                // }
                transpose[j][i] = arr[i][j];

            }
        }
        // for (int i = 0; i < transpose.length; i++) {
        //     for (int j = 0; j < transpose[i].length; j++) {
        //         System.out.print(transpose[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        printing2DArray.print(transpose);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        transpose(arr);
        // printing2DArray.print(arr);
    }
}
