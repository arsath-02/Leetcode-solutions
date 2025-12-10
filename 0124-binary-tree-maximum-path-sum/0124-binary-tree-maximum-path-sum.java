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
    private int ans =Integer.MIN_VALUE; 
    public int maxPathSum(TreeNode root) {
        maxsum(root);
        return ans;
    }
    public int maxsum(TreeNode root){
        if(root == null) return 0;

        int l = Math.max(maxsum(root.left),0);
        int r = Math.max(maxsum(root.right),0);

        ans = Math.max(ans,root.val+l+r);

        return root.val+Math.max(l,r);
    }
}