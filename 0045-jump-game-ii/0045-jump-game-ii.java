class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[n - 1] = 0; 

        for (int i = n - 2; i >= 0; i--) {
            int steps = nums[i];
            if (steps == 0) {
                dp[i] = Integer.MAX_VALUE; 
            } else {
                int minJumps = Integer.MAX_VALUE;
                for (int j = 1; j <= steps && i + j < n; j++) {
                    minJumps = Math.min(minJumps, dp[i + j]);
                }
                dp[i] = (minJumps == Integer.MAX_VALUE) ? Integer.MAX_VALUE : minJumps + 1;
            }
        }

        return dp[0];
    }
}
