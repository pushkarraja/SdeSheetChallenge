class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        
        int i = 0, j = 0;
        
        while (i < s.length()) {
            if (hs.add(s.charAt(i))) {
                i++;
                max = Math.max(max, hs.size());
            } else {
                hs.remove(s.charAt(j++));
            }
        }
        
        return max;
    }
}
