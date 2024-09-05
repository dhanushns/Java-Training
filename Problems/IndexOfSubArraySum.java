package Problems;

import java.util.*;
public class IndexOfSubArraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int left = 0, right = 0;
        boolean flag = false;
        int sum = arr[left];
        while(left <= right && right < n){

            if(sum == s){
                flag = true;
                break;
            }

            if(sum < s && right+1 < n){
                sum += arr[++right];
            }
            else if(sum > s){
                sum -= arr[left++];
            }
            else if(left == right){
                right++;
            }
        }
        if(flag)
            return new ArrayList<>(Arrays.asList(left+1,right+1));
        else return new ArrayList<>(Arrays.asList(-1));
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {0},1,1));
    }

}
