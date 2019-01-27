package Fall2018.week1;

public class Reverse_String {
    public static void main(String[] args) {
        new Reverse_String().run();
    }

    private void run() {

    }

    public String reverseString(String s) {
        char[] string = s.toCharArray();
        char[] reverse = new char[string.length];
        int j = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            reverse[j] = string[i];
            j++;
        }
        return new String(reverse);
    }
}
