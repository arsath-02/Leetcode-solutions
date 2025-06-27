class MyHashMap {
    int Arr[];
    public MyHashMap() {
        Arr = new int[1000001];
        Arrays.fill(Arr,-1);
    }
    
    public void put(int key, int value) {
        Arr[key]=value;
    }
    
    public int get(int key) {
        return Arr[key];
    }
    
    public void remove(int key) {
        Arr[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */