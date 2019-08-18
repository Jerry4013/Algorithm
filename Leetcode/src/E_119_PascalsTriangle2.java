import java.util.ArrayList;
import java.util.List;

/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/27
 **/
public class E_119_PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            int element = E_118_PascalsTriangle.combinationNumber(rowIndex, i);
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> row = getRow(30);
        String s = row.toString();
        System.out.println("s = " + s);
    }
}
