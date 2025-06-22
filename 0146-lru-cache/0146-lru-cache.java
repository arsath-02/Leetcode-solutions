class Node {
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key,int value) {
        this.key = key;
        this.value=value;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {
    int capacity;
    Node head;
    Node tail;
    Map<Integer,Node> cache;
    public LRUCache(int capacity) {
        this.capacity=capacity;
       this.head= new Node(-1,-1);
       this.tail=new Node(-1,-1);
       this.head.next=this.tail;
       this.tail.prev=this.head;
       cache = new HashMap<>();
    }
    
    public int get(int key) {
         if(!cache.containsKey(key))
    return -1;
    
    Node get_node = cache.get(key);
    remove(get_node);
    add(get_node);
    return get_node.value;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
         Node delete_node = cache.get(key);
         remove(delete_node);
     }
     Node put_node = new Node(key,value);
     cache.put(key,put_node);
     add(put_node);
     
     
     if(cache.size()>capacity){
         Node remove_node = tail.prev;
         remove(remove_node);
         cache.remove(remove_node.key);
     }
    }
    void add(Node node){
        Node nextnode = head.next;
        head.next=node;
        node.prev=head;
        node.next=nextnode;
        nextnode.prev=node;
    }
    void remove(Node node){
        Node nextnode = node.next;
        Node prevnode = node.prev;
        nextnode.prev=prevnode;
        prevnode.next=nextnode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */