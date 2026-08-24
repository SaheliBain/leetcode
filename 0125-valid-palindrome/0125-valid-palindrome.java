class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            char a = s.charAt(left);
            char b = s.charAt(right);

            if(!((a >= 'A' && a <='Z') || ( a >='0' && a <='9') || (a >= 'a' && a <= 'z') )){
                left++;
                continue;
            }

            if(!((b >= 'A' && b <='Z') || ( b >='0' && b <='9') || (b >= 'a' && b <= 'z') )){
                right--;
                continue;
            }

            if((a >= 'A' && a <='Z')) a += 32;
            if((b >= 'A' && b <='Z')) b += 32;

            if(a != b){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}