package C13_Arrays;

public class Binary_search {
    static void search(int arr[], int start, int mid,int key){
        for (int i = start; i < mid; i++) {
            if (key==arr[i]) {
                System.out.println("found at index of : "+i);
                return;
            }
        }
        System.out.println("not found");
        return;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int key =6;
        // int mid = arr[arr.length/2];
        //devide and concour
        int start=0; int end=arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(mid==key){
                System.out.println("found");
                return;
            }else if(key<arr[mid]){
                start = 0;
                end=mid;
            }else{
                start = mid+1;
                end=arr.length-1;
            }
        }
        System.out.println("not found");
        
    }
}
 