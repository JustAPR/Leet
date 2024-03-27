class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        '''if nums == sorted(nums) or nums == sorted(nums,reverse=True):
            return True
        else:
            return False'''
        increasing = decreasing = True

        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                decreasing = False
            elif nums[i] < nums[i - 1]:
                increasing = False
            if not increasing and not decreasing:
                return False

        return True
        