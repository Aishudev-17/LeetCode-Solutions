class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // Not enough flowers
        if ((long) m * k > n) {
            return -1;
        }

        // Find minimum and maximum day
        int low = bloomDay[0];
        int high = bloomDay[0];

        for (int i = 1; i < n; i++) {
            if (bloomDay[i] < low) {
                low = bloomDay[i];
            }

            if (bloomDay[i] > high) {
                high = bloomDay[i];
            }
        }

        // Binary search on days
        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean canMake(int[] bloomDay, int m, int k, int day) {

        int bouquets = 0;
        int consecutive = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                consecutive++;

                // Got k adjacent flowers
                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;
                }
            } else {
                // Adjacency broken
                consecutive = 0;
            }

            // Already made enough bouquets
            if (bouquets >= m) {
                return true;
            }
        }

        return false;
    }
}