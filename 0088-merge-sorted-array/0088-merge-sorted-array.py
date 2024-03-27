class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        while nums1 and nums1[-1] == 0:
            nums1.pop()
        nums1.extend(nums2)
        nums1.sort()
        nums1.extend([0]*(m+n-len(nums1)))
        