public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] prices =  new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit( prices));
    }

    public  static int maxProfit(int[] prices) {
            int maxProfit = 0;
            int left = 0; //buying pointer
            int right = 0; // selling pointer
            int minimumPrice =  Integer.MAX_VALUE;

        while(right < prices.length){
            if(prices[right] < minimumPrice){
                minimumPrice = prices[right];
                left = right;
            }
            maxProfit = Math.max(maxProfit, prices[right] -  minimumPrice);
            right++;

        }
        return maxProfit;

    }
}