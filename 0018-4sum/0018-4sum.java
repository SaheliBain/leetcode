class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return result;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++)
        {

            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                for(int j=i+1;j<n-2;j++)
                {
                    if(j>i+1 && nums[j]==nums[j-1])
                    {
                        continue;
                    }
                    else
                    {
                        int left=j+1;
                        int right=n-1;
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