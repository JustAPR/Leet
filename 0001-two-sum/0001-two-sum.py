class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        s = {}
        for i,x in enumerate(nums):
            if (target-x) in s:
                return [s[target-x],i]
            s[x] = i