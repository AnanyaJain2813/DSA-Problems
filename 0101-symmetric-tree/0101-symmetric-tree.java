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
    public static boolean call(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        else if(root1 == null || root2 == null) return false;
        else if(root1.val != root2.val) return false;

        boolean l = call(root1.left, root2.right);
        boolean r = call(root1.right, root2.left);

        if(l == true && r == true) return true;
        return false;
    }
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return false;
        return call(root.left, root.right);
        
    }
}