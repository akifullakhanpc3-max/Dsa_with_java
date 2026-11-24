package C16_Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String s =  "hello";
        char [] ch  =  s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        System.out.println(sb);
        
    }    
}
