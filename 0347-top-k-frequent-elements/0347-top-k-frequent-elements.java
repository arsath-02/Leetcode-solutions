class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket =new List[nums.length+1];
        for(int key : map.keySet()){
            int f = map.get(key);
            if(bucket[f]==null)
                bucket[f] = new ArrayList<>();
            bucket[f].add(key);
        }
        
        int r[] = new int[k];
        int idx =0;
        for(int i = bucket.length-1;i>=0 && idx<k;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    r[idx++]=num;
                    if(idx==k) break;
                }
            }
        }
        return r;
    }
}