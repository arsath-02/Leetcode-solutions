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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head== null && head.next == null) return head;

        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            ListNode nex = cur.next;
            int a= gcd(cur.val,nex.val);
                ListNode newnode = new ListNode(a);
                //newnode.val = ;
                newnode.next=cur.next;
                cur.next=newnode;
                cur=newnode.next;
            
        }
        return head;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        else  return gcd(b,a%b);
    }
}