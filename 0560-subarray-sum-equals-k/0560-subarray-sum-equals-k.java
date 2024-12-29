class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> m= new HashMap<>();
        m.put(0,1);
        int c=0,t=0;
        for(int n:nums){
            t+=n;
            if(m.containsKey(t-k))
            c+=m.get(t-k);

            m.put(t,m.getOrDefault(t,0)+1);
        }
        return c;

    }
}