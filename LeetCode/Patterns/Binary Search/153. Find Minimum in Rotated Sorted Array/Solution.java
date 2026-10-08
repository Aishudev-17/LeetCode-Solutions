class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // if mid element > high element, min is in right side
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } 
            // else min is in left side including mid
            else {
                high = mid;
            }
        }
        return nums[low];
    }
}
