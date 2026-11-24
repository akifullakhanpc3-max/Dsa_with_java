package C16_Strings;

public class findTheLargestString {
    public static void main(String[] args) {
        String str ="apple";
        String str2="mango";
        String str3 = "banana";

        if(str.length()>str2.length() && str.length()>str3.length()){
            System.out.println(str);
        }else if(str2.length()>str3.length()){
            System.out.println(str2);
        }else{
            System.out.println(str3);
        }

        //lexicographic order
        String fruit[] = {"apple","mango","banana"};

        String largest = fruit[0];

        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) <0) {
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
