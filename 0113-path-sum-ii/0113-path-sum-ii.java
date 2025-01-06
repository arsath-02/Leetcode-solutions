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
    void hasPathSum(TreeNode root,int targetSum,List<Integer> curr,List<List<Integer>> res){
    if(root==null)
            return ;

        curr.add(root.val);
        if(root.val==targetSum && root.left==null && root.right==null)
            res.add(new ArrayList<>(curr));
        else{
            hasPathSum( root.left, targetSum-root.val, curr,res);
            hasPathSum(root.right, targetSum-root.val, curr, res);

        }
      curr.remove(curr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res= new ArrayList<>();
        hasPathSum(root,targetSum,new ArrayList<>(),res);
        return res;
    }
}