class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b) -> a[0]-b[0]);
        List<List<Integer>> res = new ArrayList();
        int st = nums[0][0];
        int end = nums[0][1];
        int n = nums.length;
        for(int i = 1 ;i<n;i++){
            if(end >= nums[i][0]){
                end = Math.max(end,nums[i][1]);
            }
            else if(end< nums[i][0]){
                res.add(Arrays.asList(st,end));
                st = nums[i][0];
                end = nums[i][1];
            }
        }
        res.add(Arrays.asList(st,end));
        int n1 = res.size();
        int m1 = res.get(0).size();
        int r[][] = new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                r[i][j] = res.get(i).get(j);
            }
        }
        return r;
    }
}