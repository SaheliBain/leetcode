class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans= new int[nums.length];
       int splitIndex = n;

        int[] first = Arrays.copyOfRange(nums, 0, splitIndex);
        
        int[] second = Arrays.copyOfRange(nums, splitIndex, nums.length);
        int k=0;
        for (int i = 0; i < ans.length; i++) {
            if (i < first.length) ans[k++] = first[i];
            if (i < second.length) ans[k++] = second[i];
        }
        return ans;
    }
}