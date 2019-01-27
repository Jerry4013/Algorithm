package Fall2018.week1;

import java.util.regex.Pattern;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        new Length_of_Last_Word().run();
    }

    private void run() {
        System.out.println(lengthOfLastWord(" hello world"));
    }

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int last = len - 1;
        while (last >= 0 && s.charAt(last) == ' '){
            last--;
        }
        int first = last;
        while (first >= 0 && s.charAt(first) != ' '){
            first--;
        }
        return last - first;
    }
}
