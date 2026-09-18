class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int count=0;
        for (int num : nums)
        {
            if(num==1)
            {
                count++;
            }
            maxi=Math.max(maxi,count);
            if(num==0)
            {
                count=0;
            }
        }
        return maxi;
    }
}