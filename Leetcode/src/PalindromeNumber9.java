public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0, temp = x;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == temp;
    }

    public static void main(String[] args) {
        new PalindromeNumber9().run();
    }

    private void run() {
        System.out.println(isPalindrome(323));
    }
}
