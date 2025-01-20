class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> op = new HashSet<>();
        for(int num : nums)
        {
            if(num>=0)
            {
                op.add(num);
            }
        }
            int m=1;
            while(op.contains(m))
            m++;

            return m;
        
    }
}