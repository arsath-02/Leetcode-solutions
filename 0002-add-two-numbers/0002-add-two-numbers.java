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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode carr = dummy;
        int i = 0;
        while(l1 != null || l2 != null || i>0){
            if(l1 != null){
                i+=l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                i += l2.val;
                l2= l2.next;
            }
            carr.next = new ListNode(i % 10);
            i /= 10;
            carr = carr.next; 
        }
        return dummy.next;
    }
}