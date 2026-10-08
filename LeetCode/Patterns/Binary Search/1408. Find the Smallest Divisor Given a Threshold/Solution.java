class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,nums[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            int h=0;
            for(int i=0;i<n;i++){
                h+=(nums[i]+mid-1)/mid;
            }
            if(h<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

        
    }
}