package Problems;

import java.util.*;

public class IndexesOfSubArraySum {


    // Does not optimal solution time complexity : O(n^2)
    public static int DFS(int[] arr,int end,int sum,int target){

        //positive base case
        if(sum == target)
            return end+1;

        //Negative base cases
        if(end == arr.length)
            return -1;

        if(sum > target)
            return -1;

        if(end+1 < arr.length)
            sum+= arr[end+1];
        return DFS(arr,end+1,sum,target);

    }

    //Optimal Solution of Time complexity : O(n)
    public static ArrayList<Integer> twoPointersApproach(int[] arr, int target){
        int start = 0;
        int end = 0;
        int sum = 0;
        boolean flag = false;
        ArrayList<Integer> res =new ArrayList<>();

        for (int i = 0 ; i < arr.length; i++){

            sum += arr[i];

            if(sum >= target) {
                end = i;

                while(sum > target && start < end){
                    sum -= arr[start];
                    ++start;
                }
            }

            if(sum == target){
                res.add(start+1);
                res.add(end+1);
                flag = true;
                break;
            }

        }

        if(flag) return res;

        return new ArrayList<>(List.of(-1));
    }

    public static void main(String[] args) {

        int[] arr = new int[] {0};
        int s = 0;
        int n = 1;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            res.add(0,i+1);
            int end = DFS(arr,i,arr[i],s);
            if(end != -1){
                res.add(end);
                break;
            }
            res.clear();
        }
        if(res.isEmpty())
            System.out.println(-1);
        else System.out.println(res);

        System.out.println( twoPointersApproach(arr,s));

    }

}
