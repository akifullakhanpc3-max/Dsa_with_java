package C15_2DArrays;

public class Searching_in_matrix {
    static void staiir_case_Search(int arr[][]) {
        // 1. brute fource technique -- not a good solution
        int start = 0;
        int end = arr[0].length - 1;
        int key = 330;
        while (start <arr.length && end>=0) {
            if (arr[start][end] == key) {
                System.out.println("found");
                return;
            } else if (key < arr[start][end]) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 20, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        staiir_case_Search(arr);
    }
}
