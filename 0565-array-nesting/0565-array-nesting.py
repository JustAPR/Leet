class Solution:
    def arrayNesting(self, nums: List[int]) -> int:
        n = len(nums)
        visited = set()
        max_length = 0

        for i in range(n):
            if i not in visited:
                current = i
                length = 0

                while current not in visited:
                    visited.add(current)
                    current = nums[current]
                    length += 1

                max_length = max(max_length, length)

        return max_length
        