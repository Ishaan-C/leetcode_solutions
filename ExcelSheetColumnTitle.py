class Solution:
    def convertToTitle(self, columnNumber: int) -> str:

        #First, we establish a relationship b/w the letters and their numeral values

        alphabets=[''] #Adding a space at the beginning will correct the indices of the letters automatically

        for i in range (65,91):
            alphabets.append(chr(i))

        #Now the letters are correctly related to their indices i.e. A->1, B->2...

        
        #The logic used now is just converting a base 10 number to a base 26 number. This is done by repeatedly dividing by 26 and collecting remainders in reverse order
        res=""
        while columnNumber>=1:

            if(columnNumber%26==0):
                res+="Z"
                columnNumber=columnNumber//26 -1   #The -1 prevents the repeat of the loop in case Z is encountered


            else:
                res+=alphabets[columnNumber%26]
                columnNumber//=26

        return res[::-1]


