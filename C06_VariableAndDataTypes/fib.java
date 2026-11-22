package C06_VariableAndDataTypes;

public class fib {
    public static void main(String[] args) {
        int f1 = 0, f2 = 2, f3 = 0, range = 10;
        for (int i = 0; i <= 10; i++) {
            if (f3 > i) {
                int j =f3;
                    while(f3 > j) {
                        System.out.println(j);
                        j++;
                    }
                
            } else {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;

            }
        }
    }
}
