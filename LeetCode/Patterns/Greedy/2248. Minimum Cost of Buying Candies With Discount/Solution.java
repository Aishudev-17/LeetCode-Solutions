class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int sum = 0;
        int n = cost.length;

        int count = 0;

        // traverse from largest to smallest
        for (int i = n - 1; i >= 0; i--) {

            count++;

            // every 3rd candy is free
            if (count % 3 == 0) {
                continue;
            }

            sum += cost[i];
        }

        return sum;
    }
}
