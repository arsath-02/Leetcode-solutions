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
    public TreeNode sort(int start,int nums[],int n){
        if(start>n) return null;
        int mid = (start+n)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sort(start,nums,mid-1);
        root.right = sort(mid+1,nums,n);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(0,nums,nums.length-1);
    }
}