// QS:You're given an array prices where prices[i] is the price of a given stock on the i th day. You want to maximize your profit by choosing a single day 
// to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this tranjaction. If you can't achieve 
// any profit, return 0;

public class Stockmarketqs {
    public static int StockMarket(int stockprice[]){
        int buyingprice=Integer.MAX_VALUE;
        int profitprice=0;
        for(int i=0;i<stockprice.length;i++){
            if(stockprice[i]>buyingprice){
                int profit=stockprice[i]-buyingprice;
                profitprice=Math.max(profitprice,profit);
            }else{
                buyingprice=stockprice[i];
            }
        }
        return profitprice;
    }
    public static void main(String args[]){
        int stockprice[]={1,4,7,3,5,8,2};
        System.out.println("The maximum profit is :"+StockMarket(stockprice));
    }
}
