class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long res = 0;
        int x = 0;
        int val = total;
        while (val >= 0) {
            val = total - cost1 * x;
            if (val >= 0) {
                res += (long) Math.floor((long) val / (long) cost2) + 1;
            }
            x++;
        }
        return res;
    }
}
