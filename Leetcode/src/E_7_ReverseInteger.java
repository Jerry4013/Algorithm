public class E_7_ReverseInteger {
    public int reverse(int x) {
        int init = x;
        if (x < 0){
            x = -x;
        }
        long answer = 0, temp = x;
        while (temp > 0){
            answer *= 10;
            answer += temp % 10;
            temp /= 10;
        }
        int bound = (int)Math.pow(2, 31);
        if (answer > bound - 1 || answer < -bound)
            return 0;
        int result = (int)answer;
        if (init < 0){
            return -result;
        }
        return result;
    }

    public static void main(String[] args) {
        E_7_ReverseInteger e_7_reverseInteger = new E_7_ReverseInteger();
        int i = e_7_reverseInteger.reverse(1534236469);
        System.out.println(i);
    }
}
