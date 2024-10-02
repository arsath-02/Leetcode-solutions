class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> ans = new TreeSet<>();
        for(int a:arr){
            ans.add(a);
        }
        int j=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:ans){
            map.put(a,map.getOrDefault(a,0)+j);
            j++;
        }
        int i=0;
        for(int a:arr){
            arr[i]=map.get(a);
            i++;
        }
        return arr;
    }
}