class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int a[]=new int[n+m];
        for(int i=0;i<n;i++){
            a[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            a[n+i]=nums2[i];
        }
        Arrays.sort(a);
        int p=a.length;
        if(p%2!=0){
            return a[p/2];
        }
        int mid1 = a[p/ 2 - 1];
        int mid2 = a[p / 2];

        return (mid1 + mid2)/2.0;




        
    }
}