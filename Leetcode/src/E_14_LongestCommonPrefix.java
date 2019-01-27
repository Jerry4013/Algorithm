public class E_14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        int common = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            common = Math.min(common, strs[i].length());
            for (int j = 0; j < common; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    common = j;
                    break;
                }
            }
        }
        return strs[0].substring(0,common);
    }

    public static void main(String[] args) {
        E_14_LongestCommonPrefix test = new E_14_LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(test.longestCommonPrefix(strs));
    }
}
