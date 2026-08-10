class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        // Scan backward starting from the largest elements
        for (int i = nums.length - 1; i >= 2; i--) {
            // Apply Triangle Inequality: c < a + b
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                // Return the maximum perimeter found
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        
        // Return 0 if no valid triangle can be formed
        return 0;
    }
}