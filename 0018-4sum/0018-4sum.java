class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++)
        {

            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                for(int j=i+1;j<nums.length-2;j++)
                {
                    if(j>i+1 && nums[j]==nums[j-1])
                    {
                        continue;
                    }
                    else
                    {
                        int left=j+1;
                        int right=nums.length-1;
                        long rem=(long)target-nums[i]-nums[j];
                        while(left<right)
                        {
                            long sum= (long)nums[left]+nums[right];
                            if(sum==rem)
                            {
                                result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                                left++;
                                right--;
                                while(left<nums.length && nums[left]==nums[left-1])
                                {
                                    left++;
                                }
                                while(right>0 && nums[right]==nums[right+1])
                                {
                                    right--;
                                }
                            }
                            else if(sum<rem)
                            {
                                left++;
                            }
                            else
                            {
                                right--;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}