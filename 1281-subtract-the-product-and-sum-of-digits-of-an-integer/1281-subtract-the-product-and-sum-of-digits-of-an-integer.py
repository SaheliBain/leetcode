class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum=0
        p=1
        for i in str(n):
            i=int(i)
            sum+=i
            p*=i
        return p-sum

        