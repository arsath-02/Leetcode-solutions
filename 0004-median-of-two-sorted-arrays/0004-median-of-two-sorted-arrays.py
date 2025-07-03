class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1=sorted(nums1)
        #print(nums1)
        n=len(nums1)
        if n % 2 ==1:
            return nums1[n//2]
        s=(nums1[n//2] + nums1[n//2 - 1]) /2
        return s