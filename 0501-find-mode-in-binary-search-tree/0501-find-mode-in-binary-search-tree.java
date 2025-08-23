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
    public int count=0,max=0;
    public TreeNode prev = null;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        travel(root,list);
         
        int result []=new int [list.size()];
        int j=0;
       for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public void travel(TreeNode root,List<Integer> modes){
        if(root ==null) return;

        travel(root.left,modes);
        

        if(prev != null && prev.val == root.val){
           count++;
        }else{
            count=1;
        }
        if(max<count){
            max=count;
            modes.clear();
            modes.add(root.val);
        }
        else if(count==max){
            modes.add(root.val);
        }
        prev = root;

        travel(root.right,modes);
    }
}