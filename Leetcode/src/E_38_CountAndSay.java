/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/16
 **/
public class E_38_CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String previous = countAndSay(n - 1);
        char[] chars = previous.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int counter = 1;
        int i;
        for (i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i-1]) {
                counter++;
            } else {
                stringBuilder.append(counter);
                stringBuilder.append(chars[i-1]);
                counter = 1;
            }
        }
        stringBuilder.append(counter);
        stringBuilder.append(chars[i-1]);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = countAndSay(7);
        System.out.println("s = " + s);
    }
}
