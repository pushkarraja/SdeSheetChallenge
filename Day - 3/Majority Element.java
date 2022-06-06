class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = -1;
        int frequency = 0;
        
        for (int it : nums) {
            if (frequency == 0) {
                majorityElement = it;
            }
            
            if (majorityElement == it) {
                frequency++;
            } else {
                frequency--;
            }
        }
        
        return majorityElement;
    }
}
