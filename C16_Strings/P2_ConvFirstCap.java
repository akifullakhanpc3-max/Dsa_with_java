package C16_Strings;

public class P2_ConvFirstCap {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch =  Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)== ' ' && i<str.length()-1) {
                 sb.append(str.charAt(i));
                 i++;
                  sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                 sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder();
        // sb.append("hello");
        // // System.out.println(sb);
        // // sb.charAt(0) = (char)((int)sb.charAt(0)-32);
        // String s = sb.toString();
        // char[] ch =  sb.toCharArray();

        System.out.println(toUpperCase("hello"));
    }
}
