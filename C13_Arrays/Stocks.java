package C13_Arrays;

public class Stocks {
    static void profit(int arr[]){
        int buying_price = Integer.MAX_VALUE;
        int max_profit=0;


        // for (int i : arr) {
        //     buying_price = Math.min(buying_price,i);
        // }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>buying_price){//profit
                int profit = arr[i] - buying_price;//this is todays profit 
                if (profit > max_profit) {
                    max_profit=  profit;
                }
            }else{
                buying_price = arr[i];
            }
        }

        System.out.println(buying_price);
        System.out.println(max_profit);
    }
    public static void main(String[] args) {
        int prices[] =  {7,1,5,4,6,4};
        profit(prices);
    }
}
