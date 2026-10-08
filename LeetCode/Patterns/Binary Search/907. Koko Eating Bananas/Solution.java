class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
    
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            long ho=0;
            for(int i=0;i<n;i++){
             ho+=(piles[i]+(long)(mid)-1)/mid;}
            if(ho<=h){
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