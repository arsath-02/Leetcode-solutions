class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>  ans= new ArrayList<>();
        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n:nums1) set1.add(n);
        for(int n:nums2) set2.add(n);

        List<Integer> arr = new ArrayList<>(set1);
        arr.removeAll(set2);
        List<Integer> arr2= new ArrayList<>(set2);
        arr2.removeAll(set1);
        ans.add(arr);
        ans.add(arr2);
        return ans;
    }
}