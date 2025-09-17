class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int current =0,longstreak = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                current =1;
                int curr_ele = i;
                while(set.contains(curr_ele+1)){
                    current++;
                    curr_ele++;
                }
            }
            longstreak = Math.max(current,longstreak);
        }
        return longstreak;
    }
}