class Solution {
    public String convert(String s, int numRows) {
        String str = "";  // to store final result

        if (numRows == 1) 
        return s;  // in case of single row

        // Loop for each row
        for (int i = 1; i <= numRows; i++) {
            int j = i - 1;  // starting index (i.e index of first character) for current row

            // First row or last row (straight pattern). Both have same jump pattern-> From one element, we go to the 2n-2 th element following that element
            if (i == 1 || i == numRows) {
                while (j < s.length()) {
                    str += s.charAt(j);                 // add character to resulting string
                    j += 2 * numRows - 2;                     // jump pattern
                }
            } 
            // Middle rows (zigzag pattern)- follow different pattern
            else {
                boolean down = true;  // controls spacing pattern
                while (j < s.length()) {
                    str += s.charAt(j);  // add the character
                    
                    // handle spacing difference based on direction
                    if (down) j += 2 * (numRows - i);
                    else j += 2 * (i - 1);
                    down = !down;
                }  //middle rows show this pattern- starting element, element at 2n-2i distance and then element at 2i-2 distance
            }
        }

        return str;
    }
    }
