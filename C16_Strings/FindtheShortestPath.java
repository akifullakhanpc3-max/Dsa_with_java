package C16_Strings;

public class FindtheShortestPath {
    static void find(String str){
        char[] ch = str.toCharArray();
        int x= 0,
            y=0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='N') {
                y++;
            }else if (ch[i]=='E') {
                x++;
            }else if(ch[i]=='W'){
                x--;
            }
            else if(ch[i]=='S'){
                y--;
            }
        }
        System.out.println("shortest distance is");
        double res  =  Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println(res);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        find(str);
    }
}
