import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/26
 **/
public class E_118_PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                long element = combinationNumber(i, j);
                innerList.add((int) element);
            }
            outerList.add(innerList);
        }
        return outerList;
    }

    static int combinationNumber(int n, int m) {
        BigInteger bigInteger = new BigInteger("1");
        if (m < n / 2 + 1) {
            for (int i = n; i > n - m; i--) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            }
            for (int i = 1; i < m + 1; i++) {
                bigInteger = bigInteger.divide(BigInteger.valueOf(i));
            }
            return bigInteger.intValue();
        } else {
            for (long i = n; i > m; i--) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            }
            for (long i = 1; i < n - m + 1; i++) {
                bigInteger = bigInteger.divide(BigInteger.valueOf(i));
            }
            return bigInteger.intValue();
        }
    }

    public static void main(String[] args) {
        generate(25);
    }
}
