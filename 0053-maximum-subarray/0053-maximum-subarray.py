class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        dq=[0]*len(nums)
        dq[0]=nums[0]
        for i in range(1,len(nums)):
            dq[i]=max(nums[i],dq[i-1]+nums[i])

        return max(dq)
