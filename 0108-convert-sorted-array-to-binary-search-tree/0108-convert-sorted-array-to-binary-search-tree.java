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
    public TreeNode sortarray(int st, int []nums,int n){
        if(st>n) return null;
        int mid = (st+n)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left=sortarray(st,nums,mid-1);
        node.right=sortarray(mid+1,nums,n);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortarray(0,nums,nums.length-1);
    }
}