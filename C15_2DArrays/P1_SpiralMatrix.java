package C15_2DArrays;

import java.util.Arrays;

public class P1_SpiralMatrix {
    static void code(int arr[][]){
        int start_row = 0 ;
        int end_row =arr.length-1;
        int start_col=0;
        int end_col=arr[0].length-1;
        while (start_row<=end_row && start_col<=end_col) {
            //top,
            for (int i = start_col ; i <= end_col; i++) {
                System.out.print(arr[start_row][i]+" ");
            }
            //right
            for (int i = start_row+1 ; i <= end_row; i++) {
                System.out.print(arr[i][end_col]+" ");
            }
            //bottom
            for (int i = end_col-1 ; i >= start_col; i--) {
                System.out.print(arr[end_row][i]+" ");
            }

            //left
            for (int i = end_row-1 ; i > start_row; i--) {
                System.out.print(arr[i][start_col]+" ");
            }
            start_row++;end_row--;start_col++;end_col--;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr[1][1]);
        code(arr);
    }
}
