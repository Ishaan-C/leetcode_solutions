public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        char c;
        String res = "";

        outer: for (int i = 0; i < strs[0].length(); i++) {

            c = strs[0].charAt(i);
            res += c;

            inner: for (int j = 0; j < strs.length; j++) {

                if (strs[j].startsWith(res)) {
                    continue inner;
                } else {
                    // Mismatch found, so remove the last added character
                    res = res.substring(0, res.length() - 1);
                    break outer;
                }
            }
        }

        // If we never broke early (res == strs[0]), just return res as is
        return res;
    }
}


