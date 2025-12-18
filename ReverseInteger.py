class Solution:
    def reverse(self, x: int) -> int:

        temp=abs(x)     #temp stores the absolute value of x to make the reversal easier
        rev=0

        while(temp>0):
            d=temp%10
            rev=rev*10+d
            temp//=10
        #rev now contains the reversed integer without sign

        if(x>=0):
            if(rev<pow(2,31)):
                return rev
            else:
                return 0

        else:
            if((-1*rev)>=pow(-2,31)):
                return -rev
            else:
                return 0
            
        #From lines 13 to 23, we check for overflow conditions based on the sign of the original integer x and generate the final output accordingly.