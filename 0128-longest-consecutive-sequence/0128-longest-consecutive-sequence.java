class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int longestStreak = 0;

        for (int num : nums) {
            s.add(num);
        }
        for (int num : nums) {
            if (!s.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (s.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
