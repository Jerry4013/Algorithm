/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/12
 **/
public class E_172_FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int result = 0;
        for (long i = 5 ; i <= n; i *= 5) {
            result += n / i;
        }
        return result;
    }

    public static void main(String[] args) {
        int i = trailingZeroes(5);
        System.out.println(i);
    }
}
