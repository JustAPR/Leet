class Solution:
    def convert(self, s: str, n: int) -> str:
        if n<=1:
            return s
        else:
            a = ["" for x in range(len(s))]
            row = 0
            d = -1
            for i in range(len(s)):
                a[row] += s[i]
                if row == 0 or row == n-1:
                    d *= -1
                row+=d

        return "".join(a)
        