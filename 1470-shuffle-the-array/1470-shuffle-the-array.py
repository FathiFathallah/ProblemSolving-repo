class Solution(object):
    def shuffle(self, nums, n):
        #Slicing
        l1 = nums[:n]
        l2 = nums[n:]
        nums = []
        for i in range(n):
            nums.append(l1[i])
            nums.append(l2[i])
        return nums