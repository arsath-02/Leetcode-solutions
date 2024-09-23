/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if(head==NULL)
        return NULL;
    struct ListNode *prev=NULL;
    struct ListNode *temp=head;
    struct ListNode *next=NULL;
    while(temp!=NULL)
    {
        next=temp->next;
        temp->next=prev;

        prev=temp;
        temp=next;
        
    } 
    head=prev;
    return head;
}