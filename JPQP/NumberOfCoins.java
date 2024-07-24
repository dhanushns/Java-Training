package JPQP;

import java.util.ArrayList;

public class NumberOfCoins {

    // Only applicable for given coins with frequency 1
    public static void change(int[] coins,int pos, int target, int sum,ArrayList<Integer> c){

        if(target == sum) {
            System.out.println(c.size());
            return;
        }

        if(pos == coins.length)
            return;

        if(sum > target)
            return;

        c.add(coins[pos]);
        change(coins,pos+1,target,sum+coins[pos],c);
        c.remove((Integer) coins[pos]);
        change(coins,pos+1,target,sum,c);
    }

    //Coin Change in LT-322
    public static int countCoins(int[] coins,int pos,int sum,int target,int count){
        //positive base case
        if(sum == target)
            return count;

        //Negative base cases
        if(pos == coins.length)
            return Integer.MAX_VALUE;

        if(sum > target)
            return Integer.MAX_VALUE;

        return Math.min(countCoins(coins,pos,sum+coins[pos],target,count+1),countCoins(coins,pos+1,sum,target,count));
    }

    public static void main(String[] args) {

        int[] coins = {1,2,5};
        //change(coins,0,11,0,new ArrayList<Integer>());
        System.out.println(countCoins(coins,0,0,11,0));
    }

}
