class Solution:
    def romanToInt(self, s: str) -> int:
        r = {'I': 1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        ss = 0
        p=0
        for x in s:
            if r[x] > p:
                ss = ss + r[x] - (2 *p)
            else:
                ss = ss + r[x]
            p = r[x]
        return ss
