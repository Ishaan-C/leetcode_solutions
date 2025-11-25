class Solution:
    def mySqrt(self, x: int) -> int:
        

        if x==0 or x==1:  #Handling base cases here otherwise binary search will fail with L=0, U=0
            return x    


        #USING BINARY SEARCH
        L,U=1,x//2

        while L<=U:
            mid=(L+U)//2

            if (mid*mid)==x:
                return mid
            elif (mid*mid)<x:
                L=mid+1
            else:
                U=mid-1

        
        #The loop ends when L>U, at that point U will be the integer part of the sqrt of x
        return U
    
    '''
    RUNTIME- 0ms. BEATS 100%
    '''