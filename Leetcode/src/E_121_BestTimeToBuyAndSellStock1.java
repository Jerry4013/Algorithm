/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/28
 **/
public class E_121_BestTimeToBuyAndSellStock1 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
