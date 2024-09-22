class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> inp = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            inp.add(String.valueOf(i));
        }
        Collections.sort(inp);
        List<Integer> out = new ArrayList<>();
        for (String s : inp) {
            out.add(Integer.valueOf(s));
        }
        return out;
    }
}