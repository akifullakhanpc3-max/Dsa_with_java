package C12_AdvancePatterns;

// 1
// 01
// 101
// 0101
// 10101

public class Zero_One_Traiangle {
    public static void main(String[] args) {
        int n =5;
        int count=1;
        for(int i =0; i<n;i++){
            for(int j=0;j<=i;j++){
                // System.out.print(count+" ");
                // if (count==0) {
                //     count++;
                // }else{
                //     count--;
                // }

                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
