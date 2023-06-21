public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int i = 0; i<prices.length; i++)
        {
            min = Math.min(min, prices[i]);
            int profit = prices[i] - min;
            max = Math.max(max, profit);
        }
        return max;

    }

    public static void main(String[] args) {
        int[]nums  = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));

    }
}
