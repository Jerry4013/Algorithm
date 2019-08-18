/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/11
 **/
public class E_171_ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int pow26 = 1;
        for (int i = chars.length - 1; i >=0; i--) {
            int n = chars[i] - 'A' + 1;
            result += pow26 * n;
            pow26 *= 26;
        }
        return result;
    }

    public static void main(String[] args) {
        int b = titleToNumber("ZY");
        System.out.println(b);
    }
}
