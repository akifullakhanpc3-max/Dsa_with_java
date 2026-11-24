package C16_Strings;

public class String_compression {

    static String compress(String str){
        String new_String="";//O(n)
        for (int i = 0; i < str.length(); i++) {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            new_String += str.charAt(i);
            if (count>1) {
                new_String+=count.toString();
            }
        }
        
        return new_String;
    }
    //aaabbcccdd -> a3b2c3d2

    //"abc"->"abc" X(a1b1c1)
    public static void main(String[] args) {
        // String str = "aaabbcccdd";
        String str = "abbbccddd";
        int arr[] = new int [129];
        // String
        StringBuilder sb =  new StringBuilder();
        int i = 0;
        while(i<str.length()){
            arr[str.charAt(i)]++;
            i++;
        }
        i=0;
        while (i<arr.length) {
            if(arr[i] == 1){
                sb.append((char)i);
            }else if(arr[i]>1){
                sb.append((char)i);
                sb.append(arr[i]);
            }
            i++;
            // System.out.println("asljd");
        }
        System.out.println(sb);
    }      
}


