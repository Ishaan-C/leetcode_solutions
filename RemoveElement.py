class Solution(object):
    def removeElement(self, nums, val):
        if not nums:  # if list is empty
            return 0

        i = 0  # pointer for next position to place non-val element
        for j in range(len(nums)):
            if nums[j] != val:        # i.e if current element is not equal to val
                nums[i] = nums[j]    # move current element to the front
                i += 1               # increment i after moving an element to the front

        return i
'''
RUNTIME= 0 ms. BEATS 100% ON LEETCODE
MEMORY=12.39 MB. BEATS 80.33% ON LEETCODE'''

