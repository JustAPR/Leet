class Solution:
    def isHappy(self, n: int) -> bool:
        if n == 1:
            return True
        else:
            n=[i for i in str(n)]
            sum = 0
            for i in n:
                sum+= int(i)*int(i)
            if sum in [2,3,4,5,6,8,9]:
                return False
            else:
                return self.isHappy(sum)
        