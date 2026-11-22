package C13_Arrays;

public class linear_search {
    
    static int search(int key, int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (key==arr[i]) {
                System.out.println("found at index : "+i);
                return i;
            }
        }
        System.out.println("not fount the array");
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        if (search(5, arr)>=0) {
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
