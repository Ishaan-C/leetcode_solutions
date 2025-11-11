class RomanToInteger:
        
        def romanToInt(self, s):
                res=0          #result variable
                
                for i in range (0,len(s)):
                    if i==len(s)-1:      #if it is the last character, just add its value
                        res+=self.value(s[i])
                        break

                    if self.value(s[i])>=self.value(s[i+1]):
                        res+=self.value(s[i])            #adding when current character is greater than or equal to next character
                    else:
                        res-=self.value(s[i])            #subtracting when current character is less than next character
                
                return res
        
        def value(self, c):        #function to return integer value of a roman numeral
                if c=='I':
                    return 1
                if c=='V':
                    return 5
                if c=='X':
                    return 10
                if c=='L':
                    return 50
                if c=='C':
                    return 100
                if c=='D':
                    return 500
                if c=='M':
                    return 1000
                return 0