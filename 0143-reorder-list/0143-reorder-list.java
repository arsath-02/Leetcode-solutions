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
    public void reorderList(ListNode head) {
         ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
    ListNode prev = null;
    while(slow!=null){
        ListNode node = slow.next;
        slow.next=prev;
        prev = slow;
        slow =node;
    }
    ListNode f = head;
    ListNode s = prev;
    while(s!=null && f!=null){
        ListNode t1 = f.next;
        ListNode t2 = s.next;
        f.next = s;
        
        s.next = t1;
        f = t1;
        s =t2;
    }
     if (f != null) {
        f.next = null;
    }
    }
}