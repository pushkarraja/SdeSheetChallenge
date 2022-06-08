class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i : nums) {
            hs.add(i);
        }
        
        int longestStreak = 0;
        
        for (int i : hs) {
            if (!hs.contains(i - 1)) {
                int current = i;
                int currentStreak = 1;
                
                while (hs.contains(current + 1)) {
                    currentStreak += 1;
                    current += 1;
                }
                
                longestStreak =  Math.max(longestStreak, currentStreak);
                
            }
        }
        
        return longestStreak;
    }
}
