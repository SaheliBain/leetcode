class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        //if you don't have pivot, then the array is not rotated, then do normal binary search
        if(pivot==-1)
        {
            return  BinaryS(nums,  target,0, nums.length-1);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(nums[0]<=target)
        {
            return BinaryS(nums,  target,0, pivot-1);
        }
        else
        {
            return BinaryS(nums,  target,pivot+1, nums.length-1);
        }

    }
    static int BinaryS(int[] arr, int target,int start, int end)
    {
        while(start<=end)
        {
            //int mid= (start+end)/2 this may exceed the integer range
            int mid= start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1; //element is in left
            }
            else if(target>arr[mid])
            {
                start=mid+1; //element is in right
            }
            else
            {
                return mid; //ans found and target=mid
            }
        }
        return -1;
    }
    //this will not work for duplicate values
    public int findPivot(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            //4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start]>=arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }return -1;
    }
}