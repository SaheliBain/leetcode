class Solution {
    public int trap(int[] height) {
        /*
        int l = 0, r = height.length - 1;
        int lm = 0, rm = 0, ans = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                lm = Math.max(lm, height[l]);
                ans += lm - height[l];
                l++;
            } else {
                rm = Math.max(rm, height[r]);
                ans += rm - height[r];
                r--;
            }
        }
        return ans;
        */
        int n=height.length;
        if(n==0) return 0;

        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];

        for(int i =1;i<n;i++)
        {
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int totalwater=0;
        for(int i =0;i<n;i++)
        {
            totalwater+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return totalwater;
    }
}