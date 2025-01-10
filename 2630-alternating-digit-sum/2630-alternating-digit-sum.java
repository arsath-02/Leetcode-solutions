class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> ans= new ArrayList<>();
        while(n>0){
            ans.add(n%10);
            n/=10;
        }
        int curr[]= new int[ans.size()];
        int ind=0;
        for(int i=ans.size()-1;i>=0;i--){
            curr[ind++]=ans.get(i);
        }
        int an=0;
        for(int i=0;i<curr.length;i++){
            if(i%2==0)
            an+=curr[i];
            else
            an-=curr[i];
        }
        return an;
    }
}