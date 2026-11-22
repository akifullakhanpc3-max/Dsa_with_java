package C13_Arrays;

public class Kadane_algo {
    public static void algo(int arr[]) {
        // gneglate the non positive numbers
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println(max);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            if (current_sum < 0) {
                current_sum = 0;
            } else if (max_sum < current_sum) {
                max_sum = current_sum;
            }
        }
        System.out.println(max_sum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int[] arr1 = { -2, -3, -5, -3 };
        algo(arr);
    }
}
