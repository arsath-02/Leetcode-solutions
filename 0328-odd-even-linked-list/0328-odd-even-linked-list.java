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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ohead =head;
        ListNode ehead=head.next;
        ListNode e_point=ehead;
        while(e_point!=null && e_point.next!=null){
            ohead.next=e_point.next;
            ohead=ohead.next;
            e_point.next=ohead.next;
            e_point=e_point.next;
        }
        ohead.next=ehead;
        return head;
    }
}