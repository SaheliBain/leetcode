class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        String dub=s+s;
        if(dub.contains(goal))
            return true;
        else
            return false;
    }
}