class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] nums= new int[arr.length];
        int pos[]=new int[arr.length/2]; 
        int neg[]=new int[arr.length/2];
        int posInd=0, negInd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                pos[posInd]=arr[i];
                posInd++;
            }
            else
            {
                neg[negInd]=arr[i];
                negInd++;
            }
        }
        for(int i=0;i<arr.length/2;i++)
        {
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;
    }
}