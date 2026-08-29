class Solution {
    public int removeElement(int[] nums, int val) {
    int k = 0; // This acts as the pointer for where to place the next valid number

    // Loop through the entire array using the length
    for (int i = 0; i < nums.length; i++) {
        
        // If the current number is NOT the value we want to remove
        if (nums[i] != val) {
            // Place it at the 'k' index, then increment 'k'
            nums[k] = nums[i];
            k++;
        }
    }
    
    // 'k' now represents the number of elements that are not equal to 'val'
    return k;
}
}