package C08_Patterns;

public class Char_pattern {
    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(65+a));
                a++;
            }
            System.out.println();
        }
    }
}
