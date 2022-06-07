//Method 1 : Sort and use two Pointers and then compare with the original array.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] temp = new int[nums.length];
        
        System.arraycopy(nums,0,temp,0,nums.length);
        Arrays.sort(temp);
        
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        
        int l = 0, r = temp.length - 1;
        while (l < r) {
            if (temp[l] + temp[r] < target) {
                l++;
            } else if (temp[l] + temp[r] > target) {
                r--;
            } else {
                first = temp[l]; second = temp[r];
                break;
            }
        }
        
        
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == first) {
                arr.add(i);
            } else if (nums[i] == second) {
                arr.add(i);
            }
        }
        
        int[] ans = new int[2];
        for (int i = 0; i < 2; i++) {
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
}

//Method 2 : Using HashMaps :
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                return new int[]{hm.get(target - nums[i]), i};
            }
            hm.put(nums[i], i);
        }
        
        return new int[]{-1,-1};
    }
}
