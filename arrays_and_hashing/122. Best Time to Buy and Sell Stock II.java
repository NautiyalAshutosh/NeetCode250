/*
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0. 
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0; int j = 0;
        while( j < prices.length){
            if (j > 0 && prices[j-1] > prices[j]){
                maxProfit += (prices[j-1] - prices[i]);
                i = j;
            }
            j++;
        }
        maxProfit += prices[j-1] - prices[i];
        return maxProfit;
    }
}