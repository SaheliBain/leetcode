class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return false;
        /*for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
            {
                return true;
            }
            else
            {
                list.add(nums[i]);
            }
        }
        return false;
        */
    }
}