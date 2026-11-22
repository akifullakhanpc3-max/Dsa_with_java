package C07_loops;

public class rev_a_num {
    public static void main(String[] args) {
        int a = 1009321;
        int res=0;
        while (a>0) {
            int r = a%10;
            res = (res*10) + r;
            a/=10;
        }
        System.out.println(res);
    }
}
