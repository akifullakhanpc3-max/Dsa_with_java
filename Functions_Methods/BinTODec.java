package Functions_Methods;

public class BinTODec {
    public static void main(String[] args) {
        int bin = 111;
        int dec=0;
        int power=0;
        while (bin>0) {
            int temp = bin%10;
            dec+= temp*(Math.pow(2, power));
            power++;
            bin/=10;
        }
        System.out.println(dec);

        System.out.println(power);
        int a=10;
        int res=1;
        power=3;
        for (int i = 1; i <= power; i++) {
            res *= a;
        }
        System.out.println(res);

    }    
}


