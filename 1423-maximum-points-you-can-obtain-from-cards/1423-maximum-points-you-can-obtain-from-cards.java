class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0, rsum=0, maxi=0;
        for(int i=0;i<k;i++)
        {
            lsum+=cardPoints[i];
        }
        maxi=lsum;
        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[right];
            right--;
            maxi=Math.max(maxi,lsum+rsum);
        }
        return maxi;
    }
}