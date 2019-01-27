package Fall2018.week2;

import java.util.HashSet;

public class Palindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        int counter = 0;
        for (char c : arr) {
            if (!set.contains(c)){
                set.add(c);
            } else {
                set.remove(c);
                counter = counter + 2;
            }
        }
        if (set.size() == 0){
            return counter;
        } else{
            return counter + 1;
        }
    }
}
