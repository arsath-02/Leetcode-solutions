class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      int maxFreq = 0; int mostFrequentEven = -1; 
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
       { 
        if (entry.getValue() > maxFreq || (entry.getValue() == maxFreq && entry.getKey() < mostFrequentEven)) { 
        maxFreq = entry.getValue();
         mostFrequentEven = entry.getKey(); 
         } 
         }
          return mostFrequentEven;
    }
}