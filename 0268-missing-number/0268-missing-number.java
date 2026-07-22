class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i < nums.length)
        {
            int correct= nums[i];
            if(nums[i]< nums.length && nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        //case 1
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]!=j)
            {
                return j;
            }
        }
        //case 2
        return nums.length;
    }
    void swap(int arr[], int f, int s)
    {
        int temp= arr[f];
        arr[f]= arr[s];
        arr[s]=temp;
    }
    
}