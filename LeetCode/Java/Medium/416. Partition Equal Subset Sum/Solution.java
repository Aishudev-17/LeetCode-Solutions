class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        
        int sum=0;
         for(int i=0;i<n;i++){ 
            sum+=nums[i];}
            int target=sum/2;
            if(sum%2!=0){
                return false;
            }


        int dp[][]=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;}
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                dp[i][j]=dp[i-1][j];
                if(nums[i-1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-nums[i-1]]);
                }
            }
        }
        return dp[n][target]==1;
    }
}