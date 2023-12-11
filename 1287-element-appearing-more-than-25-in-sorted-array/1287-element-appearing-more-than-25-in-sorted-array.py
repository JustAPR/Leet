class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        b = set(arr)
        c = len(arr)
        d = 0.25 * c
        for x in b:
            if arr.count(x) > d:
                return x
                break
        