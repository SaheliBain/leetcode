class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxc=max(candies)
        ans=[]
        for i in candies:
            if (i+extraCandies)>= maxc:
                ans.append(True)
            else:
                ans.append(False)
        return ans
        