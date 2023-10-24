class Solution:
    def reverse(self, x: int) -> int:
        y = str(x)
        if y[0] == "-":
            y= y.replace("-","")
            y = y[::-1]
            y = "-" + y
            if int(y)<=-2147483648:
                return 0
            return int(y)
        else:
            if int(y[::-1])>=2147483647:
                return 0
            return int(y[::-1])
        