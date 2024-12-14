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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fi=head;
        ListNode sec=head;
        ListNode fast =head;
        ListNode slow=head;
        for(int i=0;i<k-1;i++)
        {
            fast=fast.next;
        }
        fi=fast;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        sec=slow;

        int temp=fi.val;
        fi.val=sec.val;
        sec.val=temp;
        return head;
    }
}