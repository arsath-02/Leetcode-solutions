class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l[] = new int[n];
        int r[] = new int[n];
        int min =0;
        for(int i=0;i<n;i++){
            min = Math.max(min,height[i]);
            l[i]=min;
            System.out.print(min);
        }
        int max=0;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            r[i]=max;
            System.out.print(max);
        }
        int trap=0;
        for(int i=0;i<n;i++){
            trap+=(Math.min(l[i],r[i])-height[i]);
        }
        return trap;
    }
}