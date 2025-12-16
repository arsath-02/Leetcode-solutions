class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> res =new ArrayList<>();


        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue() >= k){
                res.add(i.getKey());
            }
        }
        int r[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            r[i] = res.get(i);
        }
        return r;
    }
}