class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        l=[0]*n
        r=[0]*n
       
        m1=0
        for i in range(n):
            m1=max(m1,height[i])
            l[i]=m1
        m2=0
        for i in range(n-1,-1,-1):
            m2=max(m2,height[i])
            print(m2)
            r[i]=m2
        trap=0
        for i in range(n):
            trap+=(min(l[i],r[i])-height[i])
        return trap