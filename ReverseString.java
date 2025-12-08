class ReverseString_Solution {
    public void reverseString(char[] s) {

        for(int i=0,j=s.length-1;i<j;i++,j--){  
        //i stores characters from the front and j stores characters from the end
        //swapping is then done
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }

        
    }
}
/* RUNTIME- 0ms, Beats 100% and MEMORY- 48.13 MB, Beats 72.72% */