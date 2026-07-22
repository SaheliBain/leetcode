class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i = 0 ;i < nums.length ; i++)
        {
            start=Math.max(nums[i],start);//by the end it will have the maximum element
            end=end + nums[i];//sum of the array elements
        }
        while(start<end){
            //try middle as the potential ans
            int mid=start+(end-start)/2;
            //calculate how many piecesyou can divide this in this max sum
            int sum=0;
            int pieces=1;
            for(int num : nums)
            {
                if(sum + num > mid){
                   //you cannot add these into this subaaray, make new one
                   // say you add this in new subarray, then sum=num
                   sum = num;
                   pieces++;
                }
                else
                {
                    sum=sum+ num;
                }
            }
                if(pieces > k)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid;
                }
            }
            return end;
        }
        
    }
