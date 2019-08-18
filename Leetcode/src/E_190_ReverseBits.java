/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/15
 **/
public class E_190_ReverseBits {
    public static int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 32 - s.length(); i++) {
            stringBuilder.append(0);
        }
        stringBuilder.append(s);
        char[] chars = new char[32];
        stringBuilder.getChars(0, 32, chars, 0);
        int l = 0;
        int r = 31;
        char temp;
        while (l < r) {
            temp = chars[l];
            chars[l++] = chars[r];
            chars[r--] = temp;
        }
        String s1 = new String(chars);
        return Integer.parseUnsignedInt(s1, 2);
    }

}
