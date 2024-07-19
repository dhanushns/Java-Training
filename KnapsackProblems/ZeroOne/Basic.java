package KnapsackProblems.ZeroOne;

public class Basic {

    public static int getMaxProfit(int[] w, int[] val, int profit, int limit, int n){

        //base case
        if(limit == 0 || n == w.length)
            return profit;

        if(w[n] > limit)
            return profit;

        return Math.max(getMaxProfit(w,val,profit+val[n],limit-w[n],n+1) , getMaxProfit(w,val,profit,limit,n+1));

    }

    public static void main(String... argos) {
        int[] profit = new int[] {1,2,3,7,5};
        int[] weight = new int[] {1,2,3,7,5};
        int W = 12;
        int n = 0;
        System.out.println(getMaxProfit(weight,profit,0,W,n));
    }

}
