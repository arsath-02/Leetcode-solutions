import java.math.BigInteger;

class Solution {
    public int getLucky(String s, int k) {
        String ans = "";
        for (char a : s.toCharArray()) {
            ans += (a - 'a' + 1);
        }
        BigInteger num = new BigInteger(ans);
        while (k > 0) {
            BigInteger sum = BigInteger.ZERO;
            while (num.compareTo(BigInteger.ZERO) > 0) {
                sum = sum.add(num.mod(BigInteger.TEN));
                num = num.divide(BigInteger.TEN);
            }
            num = sum;
            k--;
        }
        return num.intValue();
    }
}
