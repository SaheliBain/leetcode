class Solution:
    def countDigits(self, num: int) -> int:
        temp=num
        ans=0
        while (temp>0):
            d=temp%10
            if num%d==0:
                ans+=1
            temp//=10
        return ans