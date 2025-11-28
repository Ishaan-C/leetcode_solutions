class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase();
        //adjusting the original string as per the question
        String n="";
        String rev="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
            n+=s.charAt(i);
        }
        //building the reversed string from the adjusted string
        for(int i=n.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(n.charAt(i)))
            rev+=n.charAt(i);
        }

       return (n.equals(rev)); //checking if reversed string is equal to the adjusted string

        
    }
}