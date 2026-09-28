class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Long> index = new LinkedList<>();

        q.add(root);
        index.add(0L);

        int ans = 0;

        while (!q.isEmpty()) {

            int n = q.size();

            long first = index.peek();
            long last = 0;

            for (int i = 0; i < n; i++) {

                TreeNode node = q.poll();
                long curr = index.poll();

                last = curr;

                if (node.left != null) {
                    q.add(node.left);
                    index.add(2 * curr);
                }

                if (node.right != null) {
                    q.add(node.right);
                    index.add(2 * curr + 1);
                }
            }

            ans = Math.max(ans, (int)(last - first + 1));
        }

        return ans;
    }
}