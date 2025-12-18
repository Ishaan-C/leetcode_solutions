class Solution:
    def myAtoi(self, s: str) -> int:

        s = s.strip()  # Ignoring leading and trailing whitespaces
        if not s:  # empty string after stripping
            return 0

        if s[0] == '-':
            factor = -1
            s = s[1:]  # remove the sign
        elif s[0] == '+':
            factor = 1
            s = s[1:]  # remove the sign
        else:
            factor = 1


        # adjusting for sign
        fl = 0
        newString = ""

        for i in range(len(s)):
            if (s[i] == '0' and fl == 0):
                continue
            else:
                fl = 1

            if (fl == 1):
                if s[i].isdigit():
                    newString += s[i]
                else:
                    break

        if len(newString) == 0:
            return 0

        if int(newString) >= pow(2, 31) and factor == 1:
            return pow(2, 31) - 1
        elif int(newString) > pow(2, 31) and factor == -1:
            return pow(-2, 31)
        else:
            return int(newString) * factor

        