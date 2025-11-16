class Solution(object):
    def searchInsert(self, nums, target):
        #Binary Search Approach
        L,U=0,len(nums)-1
        while L<=U:
            mid=(L+U)//2
            if nums[mid]==target:
                return mid
            elif nums[mid]<target:
                L=mid+1
            else:
                U=mid-1 
        #If match is found, the index is returned

        return L
        #If no match is found, L will be at the position where target can be inserted. Returning U is wrong because U<L after the loop ends.
        #RUNTIME: 0ms. Beats 100%.
