class Solution {
    static boolean isvalid(int a[],int k,int mid){
         int j=1,sum=0;
        for(int i=0;i<a.length;i++){
        
            if(sum+a[i]>mid){
                j++;
                sum=a[i];
            }
            else{
                sum+=a[i];
            }}
           return j<=k;


    }
    public int shipWithinDays(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            sum+=nums[i];
            
        }
        int low=max;
        int high=sum;
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(isvalid(nums,k,mid)){
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