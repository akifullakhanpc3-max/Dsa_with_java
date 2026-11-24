package C16_Strings.questions;

public class P1_countLowerAndUppercase {
    static boolean isVowel(char ch){
        return ch=='a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u';
    }
    public static void main(String[] args) {
        String str="Akif ulla khan";

        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
