class Solution {
    public boolean canPlaceFlowers(int[] bed, int n) {
        int len = bed.length;
        if(n==0) return true;
        for (int i = 0; i < len; i++) {
            if (bed[i] == 0 && (i == 0 || bed[i - 1] == 0) && (i == len - 1 || bed[i + 1] == 0)) {
                bed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
