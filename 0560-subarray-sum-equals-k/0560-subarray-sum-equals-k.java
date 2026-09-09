class Solution {

    public int subarraySum(int[] nums, int k) {

        int psum = 0;
        int count = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        mp.put(0, 1);

        for(int i = 0; i < nums.length; i++)
        {
            psum += nums[i];

            int rem = psum - k;

            if(mp.containsKey(rem))
            {
                count += mp.get(rem);
            }

            if(mp.containsKey(psum))
            {
                mp.put(psum, mp.get(psum) + 1);
            }
            else
            {
                mp.put(psum, 1);
            }
        }

        return count;
    }
}