class Solution {
    public boolean canArrange(int[] arr, int k) {
        int rem[]=new int[k];
        for(int a:arr){
            int rem1=((a%k)+k)%k;
            rem[rem1]++;
        }
        if(rem[0]%2!=0){
            return false;
        }
        for(int i=1;i<=k/2;i++){
            if(rem[i]!=rem[k-i]){
                return false;
            }
        }
        return true;
    }
}