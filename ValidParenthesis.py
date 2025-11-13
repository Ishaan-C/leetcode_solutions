class Solution:
    
    def isValid(self,s):
        brack=[]       #to store the expected closing brackets in reverse order i.e. the one that should be closed first will be at the end of the list
        for i in range(len(s)):

            if s[i]=='(':
                brack.append(')')

            elif s[i]=='{':
                brack.append('}')

            elif s[i]=='[':
                brack.append(']')

            #If all above cases fail, it means the current character is a closing bracket

            elif len(brack)==0 or s[i] != brack[-1]:   #if there is no expected closing bracket or the current closing bracket does not match the expected one
               return False
            else:
              brack.pop()

        return len(brack) == 0
        
            



