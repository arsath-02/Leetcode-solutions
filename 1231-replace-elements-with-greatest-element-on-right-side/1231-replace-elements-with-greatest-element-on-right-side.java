class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        if(n==1) return new int[]{-1};
    int max=-1;
        for(int i=n-1;i>=0;i--){
            int cur=arr[i];
                arr[i]=max;
            max=Math.max(max,cur);
        }
        return arr;
    }
}