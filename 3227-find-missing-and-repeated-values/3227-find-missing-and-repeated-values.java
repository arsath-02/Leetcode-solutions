class Solution {
    int res[] = new int[2];
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int nums [] = Arrays.stream(grid)
                                    .flatMapToInt(Arrays::stream)
                                    .toArray();
        Missing(nums);
        return res;
    }

    private void Missing(int []nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
                res[0]=i;
            }
            
        }
        

        int i=1;
        while(set.contains(i)){
            i++;
        }
        res[1]=i;
    }
}