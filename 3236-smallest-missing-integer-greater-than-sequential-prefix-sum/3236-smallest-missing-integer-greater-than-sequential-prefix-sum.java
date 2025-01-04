class Solution {
    public int missingInteger(int[] nums) {
      Set<Integer> set= new HashSet<>();
      for(int s:nums){
        set.add(s);
      }
      int sum=nums[0];
      int i=1;
      while(i<nums.length && nums[i]==nums[i-1]+1)
      {
        sum+=nums[i];
        i++;
      }
      while(set.contains(sum)){
        sum++;
      }
      return sum;
    }
}