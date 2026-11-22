package Functions_Methods;

public class DecToBin {
    public static void main(String[] args) {
        //decimal to binary
        int dec=6;
        int bin =0;
        int power=0;
        while(dec>0){
            // System.out.println(bin); 
            int temp = dec%2;
            // bin = (bin*10)+temp;
            bin += temp*Math.pow(10, power);
            dec /=2;
            power++;       
        }
        System.out.println(bin);
    }    
}
