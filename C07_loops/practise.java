package C07_loops;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("enter the number");
            int a = sc.nextInt();
            if(a%10 == 0){
                break;
            }
            System.out.println(a);
        }while (true); 

        for (int i = 0; i <=5; i++) {
            if(i==3) continue;
            System.out.println(i);
        }
    }

}
