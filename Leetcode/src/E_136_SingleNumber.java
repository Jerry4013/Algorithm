/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/04
 **/
public class E_136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num; // ^ is XOR operator
        }
        return result;
    }
}
