class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int stone:stones){
            q.add(stone);
        }
        while(q.size()>1){
            int s1=q.remove();
            int s2=q.remove();
            int s=s1-s2;
            q.add(s);
        }
        return q.remove();
    }
}