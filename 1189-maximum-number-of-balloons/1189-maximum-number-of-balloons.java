class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[5];
        int[] need={1,1,2,2,1};
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='b')     freq[0]++;
            else if(text.charAt(i)=='a')     freq[1]++;
            else if(text.charAt(i)=='l')     freq[2]++;
            else if(text.charAt(i)=='o')     freq[3]++;
            else if(text.charAt(i)=='n')     freq[4]++;
            else continue;
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<need.length;i++)
        {
            res=Math.min(freq[i]/need[i],res);
        }
        return res;
    }
}