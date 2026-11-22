package C06_VariableAndDataTypes;

import java.util.Scanner;

//boilerplate code
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a =sc.nextInt();
        // int b =sc.nextInt() ;
        // int sum=a+b;
        // System.out.print(sum);
        //question one
        int x;
        int y;
        int z;

        // System.out.println("enter the 3 numbers");
        // x = sc.nextInt();
        // y = sc.nextInt();
        // z= sc.nextInt();
        // int avg = (x+y+z)/3;
        // System.out.println("the average of three numbers is" + avg);

        //question 2 
        System.out.println("enter the side of a square");
        int a = sc.nextInt();
        int area =  a*a;
        System.out.println(area);

        System.out.println("enter the 3 items price");
        float q = sc.nextFloat();
        float e = sc.nextFloat();
        float w = sc.nextFloat();
        float total =  q+e+w;
        float total_with_gst =  (total)+(total)*18/100;
        System.out.println(total_with_gst);
         int $ = 24;
         int _ =30;
        //  int lal=_;
         System.out.println();
        // System.out.println($);
    }

}
