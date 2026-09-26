/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        ArrayList<List<Integer>> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int depth = 1;

        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> lis=new ArrayList<>();

            for(int i = 0; i < n; i++){
                TreeNode node = q.poll();
                lis.add(node.val);
               

                if(node.left != null){
                    q.add(node.left);
                }

                if(node.right != null){
                    q.add(node.right);
                }
            }
            ls.add(lis);

        
        }

        return ls;
    }
}
        
    
