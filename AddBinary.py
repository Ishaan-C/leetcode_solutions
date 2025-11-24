class Solution:
    def addBinary(self, a: str, b: str) -> str:
        max_len = max(len(a), len(b))
        res=""
        carry=0
 
        if len(a) < max_len:
            a = "0" * (max_len - len(a)) + a
 
        if len(b) < max_len:
            b = "0" * (max_len - len(b)) + b

        #Now both strings are of the same length



        for i in range(len(a)-1,-1,-1):

            if carry==1:  #When there is a carry
                if a[i]=="0" and b[i]=="0":
                    res+="1"
                    carry=0
                    continue
                elif (a[i]=="0" and b[i]=="1") or (a[i]=="1" and b[i]=="0"):
                    res+="0"
                    carry=1
                    continue
                elif (a[i]=="1" and b[i]=="1"):
                    res+="1" 
                    carry=1
                    continue


            #When there is no carry
            if a[i]=="1" and b[i]=="0":
                res+="1"
                continue
            elif a[i]=="0" and b[i]=="1":
                res+="1"
                continue
            elif a[i]=="0" and b[i]=="0":
                res+="0"
                continue
            elif a[i]=="1" and b[i]=="1":
                res+="0"
                carry=1 
                continue

        if carry==1:   #Leftover carry at the end of the addition
            res+="1"
        rev=res[::-1]
        return rev
                
