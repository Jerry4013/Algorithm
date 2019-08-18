/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/10
 **/
public class E_168_ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        String result = "";
        while (n > 0) {
            n--;
            result = (char) ('A' + n % 26) + result;
            n = n / 26;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 800; i++) {
            String s = convertToTitle(i + 1);
            System.out.println(s);
        }

    }

}
