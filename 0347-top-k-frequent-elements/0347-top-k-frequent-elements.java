class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n = nums.length;
        List<Integer> bucket[] = new List[n+1];
        for(int key :map.keySet()){
            int f = map.get(key);
            if(bucket[f] == null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(key);
        }
        int res[] = new int[k];
        int ind =0 ;
        for(int i= bucket.length-1;i>=0 && ind<k ;i--){
            if(bucket [i]!= null){
                for(int num:bucket[i]){
                    res[ind++] = num;
                    if(ind == k) break;
                }
            }
        }
        return res;
    }
}