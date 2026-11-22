package C07_Operator;

public class operator {
    public static void main(String[] args) {

        //binary operator
        int a =10;
        int b= 20;
        System.out.println("addition"+ (a+b));
        System.out.println("Sub"+ (a-b));
        System.out.println("multiplicaiton"+ (a*b));
        System.out.println("division"+ (a/b));
        System.out.println("remainder"+ (a%b));

        // unary operator
        //++a = a=a+1
        int c = a++;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(c);

        // //relational operator
        // ==
        // !=
        // >
        // <
        // >=
        // <=
        if (a==b) {
            System.out.println(a==b);
        }

        // logical operator
        // && logical and
        // || logical or 
        // ! logical not
        
        System.out.println((a<b)&&(a>b));
    }
}
