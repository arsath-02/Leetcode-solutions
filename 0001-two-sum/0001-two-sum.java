class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res[] = new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                res[k++] = map.get(target - nums[i]);
                res[k++] = i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}