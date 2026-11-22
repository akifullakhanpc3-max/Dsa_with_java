package C15_2DArrays.Questions;

public class sumof2row {
    static int sum(int arr[][], int row){
        int sum =0;
        for (int i = 0; i < arr[row-1].length; i++) {
            sum += arr[row-1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sum(arr, 2));
    }   
}
