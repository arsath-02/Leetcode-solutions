class MyQueue {
    Deque<Integer> s1,s2;
    public MyQueue() {
        s1 =new LinkedList<Integer>();
        s2 =new LinkedList<Integer>();

    }
    
    public void push(int x) {
       

        while(!s1.isEmpty())
        {
            s2.add(s1.pop());
            
        }
         s2.add(x);
         while(!s2.isEmpty())
         {
            s1.add(s2.pop());
         }
         }
    
    public int pop() {
        return s1.remove();
         
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */