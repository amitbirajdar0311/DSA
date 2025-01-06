public class BuyAndSellStocks {

  public static void main(String[] args) {
    // int[] prices = {7,1,5,3,6,4,};
    int[] prices = { 7, 6, 4, 3, 1 };
    int maxProfit = 0;
    int buyPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < buyPrice) {
        buyPrice = prices[i];
      }
      int profit = prices[i] - buyPrice;
      maxProfit = Math.max(maxProfit, profit);
    }
    System.out.println("Max Profit: " + maxProfit);
  }
}
