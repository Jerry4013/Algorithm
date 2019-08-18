import java.util.Arrays;

/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/19
 **/
public class E_66_PlusOne {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        boolean carry = false;
        if (++digits[length - 1] == 10) {
            digits[length - 1] = 0;
            carry = true;
        }
        if (length > 1) {
            for (int i = length - 2; i >= 0; i--) {
                if (carry) {
                    digits[i]++;
                }
                if (digits[i] == 10) {
                    digits[i] = 0;
                    carry = true;
                } else {
                    carry = false;
                }
            }
        }
        if (carry) {
            int[] newInteger = new int[digits.length + 1];
            newInteger[0] = 1;
            for (int i = 1; i < newInteger.length; i++) {
                newInteger[i] = digits[i - 1];
            }
            return newInteger;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] ints = plusOne(digits);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}
