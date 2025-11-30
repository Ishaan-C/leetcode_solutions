from typing import List #This statement is not there in the LeetCode skeleton. Please note that this has been added the keyword List is not builtin and so it needs to be imported. However, even without this statement, LeetCode accepted my answer.

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums.sort()

        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                return True
        
        return False
            

            