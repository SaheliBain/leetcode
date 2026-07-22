class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])
            {
                //you are in the decreasing part , this may be the ans still check left,this is why end!=mid-1
                end=mid;
                
            }
            else 
            {
                //you are in increasing part of the array, check right
                start=mid+1; // because we know that mid+1 element is mid
            }
        }
        //in the end, start==end and point the maximum element because of the 2 checks
        // start and end are always trying to find the max elementin the above two checks
        return start; //can return end also as both are equal
    }
}