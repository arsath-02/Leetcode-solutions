class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0;
        int bestValue = values[0];
        
        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, bestValue + values[j] - j);
            bestValue = Math.max(bestValue, values[j] + j);
        }
        
        return maxScore;
    }
}
