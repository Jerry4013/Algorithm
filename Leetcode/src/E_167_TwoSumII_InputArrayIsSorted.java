import java.util.Arrays;

/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/10
 **/
public class E_167_TwoSumII_InputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int position = numbers.length - 1;
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            while (target - numbers[i] < numbers[position] && position > i) {
                position--;
            }
            if (target - numbers[i] == numbers[position]) {
                result[0] = i + 1;
                result[1] = position + 1;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {2, 7, 11, 15};
        int[] ints = twoSum(test, 22);
        System.out.println(Arrays.toString(ints));
    }
}
