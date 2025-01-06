public class BuyAndSellStock {
    public static void main(String[] args){
        int[] price = {7,1,5,3,6,4};
        int maxProfit = 0;
        int bp = Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(price[i]<bp){
                bp = price[i];
            }
            int profit = price[i] - bp;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println("Max Profit: "+maxProfit);
    }
}
