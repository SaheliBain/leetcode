class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>=0)
        {
            int digit=num.charAt(i);
            if(digit%2==0){
                 i--;
                 
            }else
                break;
        }
    

        int j=0;
        while(j<num.length())
        {
            int d=num.charAt(j);
            if(d==0)
                j--;
            else
                break;
        }
        return num.substring(j,i+1);
    }
}