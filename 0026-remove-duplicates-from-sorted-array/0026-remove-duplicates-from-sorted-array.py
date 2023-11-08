class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s = 1
        for i in range(1,len(nums)):
            if nums[i] != nums[i -1]:
                nums[s] = nums[i]
                s = s +1
        return s