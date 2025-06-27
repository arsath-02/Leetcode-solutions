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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode prev = null;
        ListNode temp = head;
        ListNode next_node = null;
        while(temp!=null){
            next_node = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next_node;
            
        }
        head=prev;
        return head;
    }
}