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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return new ArrayList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int sz = q.size();
            List<Integer> ls = new ArrayList<>();

            while(sz-- > 0){
                TreeNode t = q.peek();
                q.poll();
                ls.add(t.val);
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
            }
            ans.add(0, ls);
        }
        return ans;
    }
}