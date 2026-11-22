package C12_AdvancePatterns;

// 12345 
// 1234  
// 123   
// 12    
// 1  
public class Interted_half_pyramid_with_num {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
