/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<Integer>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int n= list.size();
        int []ans= new int[n];
        Stack<Integer> s= new Stack<Integer>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&& list.get(i)>list.get(s.peek())){
                ans[s.pop()]=list.get(i);
            }
            s.push(i);
        }
        return ans;
    }
}