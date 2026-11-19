class Solution {
    public int trap(int[] height) {
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
    }
}