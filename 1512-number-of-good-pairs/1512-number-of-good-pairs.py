class Solution(object):
    def numIdenticalPairs(self, nums):
        pairs = 0
        for index, num in enumerate(nums):
            pairs += nums[index+1:].count(num)
        return pairs
            
        