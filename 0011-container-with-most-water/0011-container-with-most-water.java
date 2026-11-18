class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0; 
        int right=n-1;
        int max=Integer.MIN_VALUE;
        while(left<right)
        {
            
            int contain=Math.min(height[left],height[right])*(right-left);
            if(max<contain)
            {
                max=contain;
            }
            
            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
            
        }
        return max;
    }
}