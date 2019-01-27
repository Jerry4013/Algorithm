import java.util.HashSet;

public class E_387_FirstUnique {
    public int firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (!set.contains(chars[i])){
                set.add(chars[i]);
            } else {
                duplicate.add(chars[i]);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (!duplicate.contains(chars[i])){
                return i;
            }
        }
        return -1;
    }
    public int firstUniqChar(String s) {
        int[] ints = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ints[s.charAt(i)-97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (ints[i] < 2){
                return i;
            }
        }
        return -1;
    }
}
