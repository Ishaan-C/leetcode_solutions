class Solution(object):
    def lengthOfLastWord(self,s):
        count = 0   #to count the length of the last word

        s=s.strip()  #Remove leading and trailing spaces

        for i in range(len(s)-1,-1,-1):
            if s[i] != ' ':
                count += 1         #Increment count for each character in the last word
            else:
                break 
        
        return count       #Return the length of the last word
'''
RUNTIME: 0ms. Beats 100%.'''
