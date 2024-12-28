class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s =new Stack<>();
        int n=temperatures.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
                int index = s.pop(); 
                res[index] = i -index;
            }
            s.push(i);
        }
        return res;
     }
}