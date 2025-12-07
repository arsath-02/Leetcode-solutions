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
    public ListNode merge(ListNode node1, ListNode node2){
        if(node1 == null) return node2;
        if(node2 == null) return node1;

        ListNode temp = node1;
        if(node1.val <= node2.val){
            node1=node1.next;
        }
        else{
            temp = node2;
            node2 = node2.next;
        }
        ListNode head = temp;
        while(node1 != null && node2 != null){
            if(node1.val <= node2.val){
                temp.next = node1;
                node1 = node1.next;
            }
            else{
                temp.next = node2;
                node2 = node2.next;
            }
            temp = temp.next;
        }
        if(node1 == null){
            temp.next = node2;
        }
        else{
            temp.next = node1;
        }
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        for(ListNode node : lists)
            head = merge(node,head);
        return head;
    }
}