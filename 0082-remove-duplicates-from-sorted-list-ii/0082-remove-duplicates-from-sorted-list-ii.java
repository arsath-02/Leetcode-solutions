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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null|| head.next==null)
        return head;

        while(head.val!=head.next.val){
            head.next=deleteDuplicates(head.next);
            return head;
        }

        ListNode temp = head.next;
        while(temp!=null && temp.val==head.val){
            temp=temp.next;
        }
        return deleteDuplicates(temp);
    }
}