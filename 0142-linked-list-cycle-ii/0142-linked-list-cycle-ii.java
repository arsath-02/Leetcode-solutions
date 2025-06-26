/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //if(head==null || head.next ==null) return head;
        
        ListNode slow = head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            //if(fast==null || fast.next==null) return slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode start =head;
                while(start!=slow){
                    start=start.next;
                    slow=slow.next;
                }
                return start;
            }
        }
        return null;
    }
}