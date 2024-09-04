class Solution(object):
    def reformatNumber(self, number):
        """
        :type number: str
        :rtype: str
        """
        number=number.replace(' ','')
        number=number.replace('-','')

        output=[]
        while len(number)>4:
            output.append(number[:3])
            number=number[3:]
        if len(number)<=3:
            output.append(number)
        else: 
            output.append(number[:2])
            output.append(number[2:])
        return '-'.join(output)
