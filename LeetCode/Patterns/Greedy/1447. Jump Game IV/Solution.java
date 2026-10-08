class Solution {

    public int minJumps(int[] arr) {

        int n = arr.length;

        if (n == 1) return 0;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Store all indices for each value
        for (int i = 0; i < n; i++) {

            map.putIfAbsent(arr[i], new ArrayList<>());

            map.get(arr[i]).add(i);
        }

        Queue<Integer> q = new LinkedList<>();

        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        int steps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int curr = q.poll();

                // reached end
                if (curr == n - 1) {
                    return steps;
                }

                // i + 1
                if (curr + 1 < n && !vis[curr + 1]) {

                    vis[curr + 1] = true;
                    q.offer(curr + 1);
                }

                // i - 1
                if (curr - 1 >= 0 && !vis[curr - 1]) {

                    vis[curr - 1] = true;
                    q.offer(curr - 1);
                }

                // same value jumps
                if (map.containsKey(arr[curr])) {

                    for (int next : map.get(arr[curr])) {

                        if (!vis[next]) {

                            vis[next] = true;
                            q.offer(next);
                        }
                    }

                    // very important optimization
                    map.remove(arr[curr]);
                }
            }

            steps++;
        }

        return -1;
    }
}