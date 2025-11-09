public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        String res="",temp="";
        for(int i=0;i<s.length();i++){
            String ch=s.charAt(i)+"";
            if(!(temp.contains(ch))){
                temp+=s.charAt(i);
            }
            else{
                if(res.length()<temp.length()){
                    res=temp;
                }
                int ind=temp.indexOf(ch);
                temp=temp.substring(ind+1)+ch;  //updated logic- cuts off first repeating character and adds current character
                //previous attempt using temp=ch passed 408 test cases out of 988, failing on "dvdf"
                /*temp=ch assumed temp should start from the repeated character so that would give
                 * "df" as the longest substring but actually it should start from the next character after the first occurrence of the repeated character
                 * hence temp should be "vdf". This has been done in the updated logic. 
                 */

            }
        }
        if(res.length()<temp.length()){
                    res=temp;
                }
        return res.length();        
    
}
}
