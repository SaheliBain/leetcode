class Solution {
   public static int fun(int arr[], int i, int buy, int cap,int dp[][][])
    {
        if(i==arr.length || cap==0) return 0;
        //will check if it's already solve
        if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        int p=0;
        if(buy==1)
        {
           p=Math.max(- arr[i]+fun(arr,i+1,0,cap,dp), 0 + fun(arr,i+1,1,cap,dp));
        }
        else
        {
            p=Math.max( arr[i]+fun(arr,i+1,1,cap-1,dp), 0 + fun(arr,i+1,0,cap,dp));
        }
        dp[i][buy][cap]=p;
        return p;
    }
    public static int maxProfit(int[] arr)
    {
        int n= arr.length;
        int dp[][][]=new int[n][2][3];
        //Initializing the elements of the dp array with -1
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        int ans=fun(arr,0,1,2,dp);
        return ans;
    }
}