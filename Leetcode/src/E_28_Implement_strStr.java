public class E_28_Implement_strStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }
        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        for (int i = 0; i < hay.length; i++) {
            if (hay[i] == nee[0]){
                int j;
                for (j = 1; j < nee.length; j++) {
                    if (i+j>hay.length-1){
                        return -1;
                    }
                    if (hay[i+j] != nee[j]){
                        break;
                    }
                }
                if (j == nee.length){
                    return i;
                }
            }
        }
        return -1;
    }

}
