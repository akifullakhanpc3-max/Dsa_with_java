package C07_loops;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        for (int i = 2; i < a / 2; i++) {
             if(a%i==0){
                System.out.println("not a prime");
                return;
             }
        }
        System.out.println("the given number is prime");
    }
}
