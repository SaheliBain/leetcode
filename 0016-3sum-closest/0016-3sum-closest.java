class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int result=0;
        for(int i = 0 ; i < nums.length - 2; i++)
        {
            int left=i+1;
            int right=nums.length-1;
            int sum=0,d=0;
            while(left<right)
            {
                sum=nums[i]+nums[left]+nums[right];
                d=Math.abs(sum-target);
                if(d<diff)
                {
                    diff=d;
                    result=sum;
                } 
                if(sum==target)
                {
                    return result;
                }
                else if(sum<target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return result;
    }
}