public class Stocks {

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String args[]){
        Stocks sum = new Stocks();
        int[] a = {2, 52, 70, 23, 42};
        System.out.println(Stocks.maxProfit(a));
    }
}
