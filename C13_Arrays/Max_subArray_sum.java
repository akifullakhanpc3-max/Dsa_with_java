package C13_Arrays;

public class Max_subArray_sum {
    static void sub_arr_sum(int arr[]){
        int sum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length; j++) {
                // System.out.print(arr[i]+" "+arr[j]+" ");
                int max=0;
                for (int k = i; k <= j; k++) {
                    max += arr[k];
                }
                if (sum<max) {
                    sum = max;
                }
            }
            // System.out.println();
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        sub_arr_sum(arr);
    }
}
