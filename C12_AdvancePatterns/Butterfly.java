package C12_AdvancePatterns;

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

public class Butterfly{
    public static void main(String[] args) {
        // System.out.println("askjfhss");
        int n =4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            // for (int j = 0; j < n-i-1; j++) {
            //     System.out.print(" ");
            // }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=n-i-1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}