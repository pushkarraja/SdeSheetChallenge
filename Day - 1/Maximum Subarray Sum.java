// Returns maximum element if maximum Subarray Sum is negative :

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        
        return maxSum;
    }
}



// Returns 0 if maximum Subarray Sum is negative :

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxSum = Long.MIN_VALUE;
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) sum = 0;
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
	}

}
