class Solution {
    public int gcd(int a,int b){
        if(a==b) return a;
        if(a>b) return gcd(a-b, b);
        else
        return gcd(a, b-a);
    }
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i:nums){
            if(min<i) min=i;
            if(max>i) max=i;
        }
        return gcd(min,max);
    }
}