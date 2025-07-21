class Solution:
    def makeFancyString(self, s: str) -> str:
        res=""
        res=s[0]
        c=1
        for i in range(1,len(s)):
            if s[i]==s[i-1]:
                c+=1
            else:
                c=1
            if c<3:
                res=res+s[i]
        return res