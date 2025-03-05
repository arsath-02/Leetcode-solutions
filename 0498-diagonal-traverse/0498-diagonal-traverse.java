class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer,ArrayList> map = new HashMap<>();
        int  r = mat.length;
        int c = mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int sum = i+j;
                if(!map.containsKey(sum)){
                    map.put(sum,new ArrayList<>());
                }  
                map.get(sum).add(mat[i][j]);
            }
        }
        int res[] = new int[r*c];
        int itr=0;
        int itr2=0;
        for(int i:map.keySet()){
            ArrayList<Integer> list = map.get(i);
            if(itr%2==0)
            {
                Collections.reverse(list);
                
            }
            
            for(int j:list){
                res[itr2]=j;
            itr2++;
            }
            


        itr++;              
        }
        return res;
    }
}