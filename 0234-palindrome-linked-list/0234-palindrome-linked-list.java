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
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while(slow != null){
            ListNode curr = slow.next;
            slow.next = prev;
            prev = slow;
            slow = curr;
        }
        ListNode   second= prev;
        ListNode first = head;
        while(second != null && first !=null){
            if(second.val !=first.val){
                return false;
            }
            second = second.next;
            first = first.next;
        }
        return true;

    }
}