class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, i = 0, two = nums.length - 1;
        
        while (i <= two) {
            if (nums[i] == 0) {
                int t = nums[i];
                nums[i] = nums[zero];
                nums[zero] = t;
                zero++; i++;
            } else if (nums[i] == 2) {
                int t = nums[i];
                nums[i] = nums[two];
                nums[two] = t;
                two--;
            } else {
                i++;
            }
        }
    }
}
