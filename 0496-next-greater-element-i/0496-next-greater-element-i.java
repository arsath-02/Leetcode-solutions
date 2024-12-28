class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<Integer>();
        Map<Integer,Integer> m = new HashMap<>();
        int n1=nums1.length;
        int n2=nums2.length;
        //s.push(nums2[0]);
       for(int i:nums2){
            while(!s.isEmpty() && s.peek()<i){
                m.put(s.pop(),i);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            m.put(s.pop(),-1);
        }
        for(int i=0;i<n1;i++){
            nums1[i]=m.get(nums1[i]);
        }
        return nums1;
    }
}