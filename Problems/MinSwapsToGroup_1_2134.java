package Problems;

public class MinSwapsToGroup_1_2134 {

    public static int minSwaps(int[] nums){
        int n = nums.length;
        int k = 0;
        for(int i = 0; i < n ; i++)
            if(nums[i] == 1)
                k++;

        int start = 0, count_ones = 0,max_ones = Integer.MIN_VALUE;
        for(int end = 0 ; end < n+k ; end++){

            if(end - start >= k){
                count_ones -= nums[start%n];
                start+=1;
            }

            if(nums[end%n] == 1)
                count_ones++;
            max_ones = Math.max(max_ones,count_ones);
        }

        return k - max_ones;
    }

    public static void main(String args[]){
        int[] nums = new int[] {1,1,0,1,0};
        System.out.println(minSwaps(nums));
    }

}
