class Solution:
    def isPalindrome(self, x: int) -> bool:
        n=x
        r=0
        while(n>0):
            d=n % 10
            r=r*10+d
            n//=10
        if r== x:
            return True
        else:
            return False