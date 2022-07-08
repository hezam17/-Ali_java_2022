
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
 */
//Али Хезам 11-013

class Main {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 9, 1};
        int max_profit = maxProfit(prices);
        System.out.println(max_profit);
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0],
                maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

                // Checking for higher profit
            else if (prices[i] - buy > maxProfit)
                maxProfit = prices[i] - buy;
        }
        return maxProfit;

    }
}

