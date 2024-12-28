class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n=nums.length;
        int res[]=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=nums[i%n]){
                s.pop();
            }
            if(s.isEmpty()){
            res[i%n]=-1;
            }
            else{
            res[i%n] =s.peek();
            }
            s.push(nums[i%n]);
        }
        return res;
    }
}