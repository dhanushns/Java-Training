package Problems;

import java.util.ArrayList;

public class IndexesOfSubArraySum {


    public static void getIndex(int[] arr, int pos,int sum,int target, ArrayList<Integer> subArray){

        //positive base case
        if(sum == target) {
            System.out.println(subArray.getFirst() + " " + subArray.getLast());
            return;
        }

        //negative basecase
        if(sum > target || sum == -1)
            return;

        if(pos == arr.length)
            return;

        subArray.add(pos+1);
        getIndex(arr,pos+1,sum+arr[pos],target,subArray);
        subArray.remove((Integer) (pos+1));
        getIndex(arr,pos+1,sum,target,subArray);
    }

    public static void main(String[] args) {

        int[] arr = new int[] {5,3,4};
        int s = 2;
        int n = 5;
        getIndex(arr,0,0,s,new ArrayList<>());
    }

}
