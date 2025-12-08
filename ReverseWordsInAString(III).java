class ReverseWordsInAStringIII_Solution {

    public String reverseWords(String s) {
        String n = s+" ";  // adding a space to register the last word
        String revString = "", word = ""; // to store final reversed string and the current word

        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)!=' ')
                word += n.charAt(i);
            else {   // extracting individual words
                revString += reverse(word)+" ";
                word = "";               // reset word after reversing
            }
        }
        return revString.trim(); 
    }

    String reverse(String a) {
        String revWord = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            revWord += a.charAt(i);
        }
        return revWord;
    }

    
}
