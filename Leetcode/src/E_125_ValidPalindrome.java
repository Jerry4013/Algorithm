/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/31
 **/
public class E_125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.equals("")) {
            return true;
        }
        char[] string = s.toCharArray();
        int j = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] >= 65 && string[i] <= 90) {
                string[j] = (char) (string[i] + 32);
                j++;
            } else if (string[i] >= 97 && string[i] <= 122 || string[i] >= 48 && string[i] <= 57) {
                string[j] = string[i];
                j++;
            }
        }
        int k = j - 1;
        for (int i = 0; i < j / 2; i++) {
            if (string[i] != string[k]) {
                return false;
            }
            k--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("palindrome = " + palindrome);
        boolean race_a_car = isPalindrome("race a car");
        System.out.println("race_a_car = " + race_a_car);
        boolean op = isPalindrome("0P");
        System.out.println("0P = " + op);
    }
}
