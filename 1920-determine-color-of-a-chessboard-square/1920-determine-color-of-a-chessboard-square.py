class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        a = ord(coordinates[0])-ord('a')
        b = int(coordinates[1])-1
        return (a+b)%2!=0