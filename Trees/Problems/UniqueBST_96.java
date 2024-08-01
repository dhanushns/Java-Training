package Trees.Problems;

public class UniqueBST_96 {

    public static void main(String[] args) {

        int n = 5;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            int total = 0;
            for(int j = 1; j <= i ; j++){
                int left = j-1;
                int right = i-j;
                total += dp[left] * dp[right];
            }
            dp[i] = total;
        }
        System.out.println(dp[n]);
    }

}
