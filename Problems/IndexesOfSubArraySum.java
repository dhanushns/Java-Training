package Problems;

import java.util.ArrayList;

public class IndexesOfSubArraySum {


    public static void getIndex(int[] arr, int pos,int sum,int target, ArrayList<Integer> subArray){

        //positive base case
        if(sum == target) {
            System.out.println(subArray.getFirst() + " " + subArray.getLast());
            return;
        }

        //negative base case
        if(sum > target)
            return;

        if(pos == arr.length)
            return;

        subArray.add(pos+1);
        getIndex(arr,pos+1,sum+arr[pos],target,subArray);
        subArray.remove((Integer) (pos+1));
        getIndex(arr,pos+1,sum,target,subArray);
    }

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int s = 15;
        int n = 5;
        getIndex(arr,0,0,s,new ArrayList<>());
    }

}
