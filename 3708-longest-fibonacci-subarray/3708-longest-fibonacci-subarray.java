class Solution {
    public int longestSubarray(int[] nums) {
        // A subarray of length 1 or 2 is always Fibonacci
        if (nums.length <= 2) return nums.length;
        
        int max_len = 2; 
        int current_len = 2; 
        
        for (int i = 2; i < nums.length; i++) {
            int c = nums[i-1] + nums[i-2];
            
            if (nums[i] == c) {
                // Sequence continues, add 1 to the length
                current_len++;
                // Update the maximum length found so far
                max_len = Math.max(max_len, current_len);
            } else {
                // Sequence broke, reset current length back to the base of 2
                current_len = 2;
            }
        }
        
        return max_len;
    }
}