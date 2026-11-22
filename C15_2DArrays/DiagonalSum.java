package C15_2DArrays;


public class DiagonalSum {

    public static void diagonal_sum(int arr[][]){
        int primary_diagonal=0;
        int secondary_diagonal=0;
        int sum =0;


        // for (int i = 0; i < arr.length; i++) {

        //O(n2)
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (i==j) {
        //             primary_diagonal+=arr[i][j];
        //         }

        //         //i+j = n-1
        //         if(arr[0].length-1-i == j){
        //             secondary_diagonal+= arr[i][j];
        //         }
        //     }
        // }

        //optimized solution
        //O(n) -> time complexity
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i][i];
            if(i != arr[0].length-i-1)
            sum+=arr[i][arr[0].length-1-i];

        }

        // sum= primary_diagonal+secondary_diagonal;
            System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonal_sum(arr);
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
    }
}
