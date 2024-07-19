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

    public static void main(String[] args) {

        int[] coins = {9,6,5,1};
        change(coins,0,10,0, new ArrayList<>());

    }

}
