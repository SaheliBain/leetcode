class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> freq= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i),0)+1);
        }
        boolean odd=false;
        int count=0;
        for(char ch: freq.keySet())
        {
            if(freq.get(ch)%2==0)
                count+=freq.get(ch);
            else
                odd=true;
        }
        if(odd==false) return count;
        for(char ch:freq.keySet())
        {
            if(freq.get(ch)%2==1)
                count+=freq.get(ch)-1;
        }
        return count+1;
    }
}