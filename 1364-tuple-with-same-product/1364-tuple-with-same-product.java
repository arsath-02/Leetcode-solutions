class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int pro=nums[i]*nums[j];
                map.put(pro,map.getOrDefault(pro,0)+1);
            }
        }
        int res=0;
        for(int count:map.values()){
            int pair=(count*(count-1))/2;
            res+=8*pair;
        }
        return res;
    }
}