class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int total=0;
        int speed=0;
        int max=piles[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,piles[i]);
        }
        int l=1,r=max;
        while(l<r){
            int mid=l+(r-l)/2;
            total=0;
            for(int i=0;i<n;i++){
                total+=Math.ceil((double)piles[i]/mid);
                if(total>h) break;
            }
            if(total<=h) r=mid;
            else l=mid+1;
        }
        return l;
    }
}