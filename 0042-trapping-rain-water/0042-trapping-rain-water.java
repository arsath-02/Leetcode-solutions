class Solution {
    public int trap(int[] height) {
        int l = 0 ;
        int n = height.length;
        int r = n - 1;
        int TrappedWater = 0;
        int Lmax = 0;
        int Rmax = 0;
        while(l<r){
            if(height[l] < height[r]){
                if(height[l] >= Lmax){
                    Lmax = height[l];
                }
                else{
                    TrappedWater += Lmax - height[l]; 
                }
                l++;
            }
            else{
                if(height[r] >= Rmax){
                    Rmax = height[r];
                }
                else{
                    TrappedWater += Rmax - height[r];
                }
                r--;
            }
        }
        return TrappedWater;

    }
}