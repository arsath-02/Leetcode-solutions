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
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> st= new Stack<>();
        ListNode c=head;
        while(c!=null)
        {
            st.push(c.val);
            c=c.next;
        }
        c=head;
        while(c!=null && c.val == st.pop())
        {
            c=c.next;
        }
        return c==null;
    }
}