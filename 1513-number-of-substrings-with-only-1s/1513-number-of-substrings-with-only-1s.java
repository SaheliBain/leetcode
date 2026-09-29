class Solution {
    public int numSub(String s) {
        long sub = 0;
        long c = 0;
        int mod = 1000000007;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
                // Add the current consecutive count to the total immediately
                sub = (sub + c) % mod;
            } else {
                // Reset the consecutive counter when encountering a '0'
                c = 0; 
            }
        }
        
        return (int) sub;
    }
}