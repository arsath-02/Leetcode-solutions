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
    public int depth = 0;
    public int maxDepth(TreeNode root) {
        dfs(root,1);
        return depth;
    }
    public void dfs(TreeNode root , int currdepth){
        if(root == null) return;

        depth = Math.max(depth,currdepth);

        if(root.left!= null)
            dfs(root.left,currdepth+1);

        if(root.right!=null)
            dfs(root.right,currdepth+1);
    }
}