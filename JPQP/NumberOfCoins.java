package JPQP;

import java.util.ArrayList;

public class NumberOfCoins {

    // Only applicable for the combinations of given coins
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

    static int MIN_COUNT = Integer.MAX_VALUE;
    public static int countCoins(int[] coins,int pos,int sum,int target,int count){
        //positive base case
        if(sum == target)
            return count;

        //Negative base cases
        if(pos == coins.length)
            return Integer.MAX_VALUE;

        if(sum > target)
            return Integer.MAX_VALUE;

        int n1 = countCoins(coins,pos,sum+coins[pos],target,count+1);
        int n2 = countCoins(coins,pos+1,sum,target,count);

        return Math.min(n1,n2);
    }

    public static void main(String[] args) {

        int[] coins = {1,2,3,4};
        change(coins,0,10,0,new ArrayList<Integer>());
        System.out.println(countCoins(coins,0,0,12,0));
    }

}
