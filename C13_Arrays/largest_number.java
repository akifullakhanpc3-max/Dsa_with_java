package C13_Arrays;

public class largest_number {
    
    
    public static void main(String[] args) {
    int []arr={6,9,256,5,26,4,9,3,7,1,65,7,26};
    int max=Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (max< arr[i]) {
            max=arr[i];
        }if (min>arr[i]) {
            min = arr[i];
        }
    } 
    System.out.println("the largest number in an array : "+max);
    System.out.println("smallest number of an array is : "+ min);   
    }
}
