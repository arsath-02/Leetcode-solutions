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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        dfs(root1,l1);
        dfs(root2,l2);
        return l1.equals(l2);
    }
    public void dfs(TreeNode root,List<Integer> l){
        if(root!=null){
            if(root.left==null &&root.right==null)
            l.add(root.val);
           dfs(root.left,l);
           dfs(root.right,l); 
        }
    }
}