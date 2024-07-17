package Problems;

public class BuyAndSellStock {

    public static int DFS(int[] prices, int boughtDate, int pos, boolean[] visitedDates){

        //negative base case
        if(pos == prices.length)
            return 0;

        //positive base case
        if(prices[pos] > boughtDate){
            visitedDates[pos] = true;
            return prices[pos] - boughtDate;

        }

        return DFS(prices,boughtDate, pos +1,visitedDates);

    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        boolean[] visitedDates = new boolean[prices.length];
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(!visitedDates[i]){
                visitedDates[i] = true;
                profit += DFS(prices,prices[i],i,visitedDates);
            }
        }
        System.out.println(profit);

    }

}
