public class LongestCommonPrefix{

    public String longestCommonPrefix(String[] strs) {

        char c;

        String res="";

        outer: for(int i=0;i<strs[0].length();i++){

            c=strs[0].charAt(i);

            res+=c;

            inner: for(int j=0;j<strs.length;j++){

                 if(strs[j].startsWith(res)){
                continue inner;
                }

                else{
                break outer;}
            }

            
    }
    return res.substring(0,res.length()-1);
}
    }


