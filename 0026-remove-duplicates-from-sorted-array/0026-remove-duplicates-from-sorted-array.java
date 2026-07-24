class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        return 0;
        int unique=1;
        for(int cm=1;cm<nums.length;cm++){
            if(nums[cm]!=nums[cm-1])
            {
                nums[unique]=nums[cm];
                unique++;
            }
        }
        return unique;
    }
}