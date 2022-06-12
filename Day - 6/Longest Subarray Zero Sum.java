public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int longest = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int sum = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            
            if (sum == 0) {
                longest = Math.max(longest, i + 1);
            } else {
                if (hm.containsKey(sum)) {
                    longest = Math.max(longest, i - hm.get(sum));
                } else {
                    hm.put(sum, i);
                }
            }
        }
        
        return longest;
	}
}
