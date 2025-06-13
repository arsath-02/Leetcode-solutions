class MyLinkedList {
    Node head = null;

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        int i=0;
        Node curr = head;
        while(curr!=null && i<index){
            curr = curr.next;
            i++;
        }
        if(curr==null)
        return -1;
        else
        return curr.val;
    }
    
    public void addAtHead(int val) {
    Node newnode = new Node(val);
    newnode.next = head;
    head = newnode;
    }
    
    public void addAtTail(int val) {
        Node newnode = new Node (val);
        
        if(head==null){
            head = newnode;
            return;
        }
        Node curr = head;
        while(curr.next!= null){
            curr = curr.next;
        }
        curr.next = newnode;

    }
    
    public void addAtIndex(int index, int val) {
        
        if(index==0){
            addAtHead(val);
            return;
        }
        Node newnode = new Node(val);
        Node curr = head;
        int i=0;
        while(curr!=null && i<index-1){
            curr = curr.next;
            i++;
        }
        if(curr==null) return;
        newnode.next = curr.next;
        curr.next  = newnode;
    }

    
    public void deleteAtIndex(int index) {
        if(head == null) return;
        if(index == 0){
            head = head.next;
            return ;
        }
        Node curr = head;
        int i=0;
        while(curr != null && i<index-1){
            curr = curr.next;
            i++;
        }
        if(curr ==null || curr.next==null) return ;

        curr.next = curr.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */