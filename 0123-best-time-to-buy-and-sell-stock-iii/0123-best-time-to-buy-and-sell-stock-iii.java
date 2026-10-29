class Solution {

    public static int maxProfit(int[] arr)
    {
        int n=arr.length;
        int dp[][][]=new int[n+1][2][3];
        //base case is already solved because 0 by default
        for(int i=n-1;i>=0;i--)
        {
            for(int buy=0; buy<=1;buy++)
            {
                for(int cap=1;cap<=2;cap++)
                {
                    if(buy==1)
                    {
                        dp[i][buy][cap]=Math.max(-arr[i]+dp[i+1][0][cap], 0+dp[i+1][1][cap]);
                    }
                    else
                    {
                       dp[i][buy][cap]=Math.max(arr[i]+dp[i+1][1][cap-1], 0+dp[i+1][0][cap]); 
                    }
                }
            }
        }
        return dp[0][1][2];
    }
}