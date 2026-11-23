class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0; 
        int high=k-1;
        
        int sum=0;
        double res=Double.NEGATIVE_INFINITY;;
        for(int i=low;i<=high;i++)
        {
            sum+=nums[i];
        }
       
        while(high<nums.length)
        {
            res=Math.max(res,sum);
            low++;
            high++;
            if(high==nums.length)
                break;
            sum=sum-nums[low-1]+nums[high];
            
        }
        return (double) res/k;
    }
}