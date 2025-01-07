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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return res;
        }
        q.add(root);

        while (!q.isEmpty()) {
            int ans =0;
            int n = q.size();
            while (n != 0) {
                TreeNode value = q.poll();
                ans=value.val;
                if (value.left != null) q.add(value.left);
                if (value.right != null) q.add(value.right);
                n--;
            }
            res.add(ans);
        }
        return res;
    }
}