class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int n = nums.length;

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }

        if(Math.abs(target) > sum) {
            return 0;
        }

        if((sum + target) % 2 != 0) {
            return 0;
        }

        int req = (sum + target) / 2;

        int dp[][] = new int[n + 1][req + 1];

        dp[0][0] = 1;

        for(int i = 1; i <= n; i++) {

            // Ways to make sum 0
            dp[i][0] = dp[i - 1][0];

            if(nums[i - 1] == 0) {
                dp[i][0] += dp[i - 1][0];
            }

            for(int j = 1; j <= req; j++) {

                // Don't take
                dp[i][j] = dp[i - 1][j];

                // Take
                if(nums[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][req];
    }
}