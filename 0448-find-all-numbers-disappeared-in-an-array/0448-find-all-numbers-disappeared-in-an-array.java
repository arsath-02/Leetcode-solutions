class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> op = new HashSet<>();
        List<Integer> ans= new ArrayList<>();
        for(int num : nums)
        {
            
                op.add(num);
            
        }
            for(int i=1;i<=nums.length;i++){
                if(!op.contains(i))
                ans.add(i);
            }
            return ans;
    }
}