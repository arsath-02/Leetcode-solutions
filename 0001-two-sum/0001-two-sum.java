class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                target -= nums[i];
                res[k++] = i;
            }
            map.put(nums[i],0);
        }
        return res;
    }
}