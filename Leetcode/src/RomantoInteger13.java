public class RomantoInteger13 {
    public static void main(String[] args) {
        new RomantoInteger13().run();
    }

    private void run() {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = getValue(chars[0]), previous, current;
        for (int i = 1; i < chars.length; i++) {
            current = getValue(chars[i]);
            previous = getValue(chars[i - 1]);
            if (current > previous){
                sum = sum + current - 2 * previous;
            } else {
                sum = sum + current;
            }
        }
        return sum;
    }

    private int getValue(char roman){
        int result = 0;
        if (roman == 'I'){
            result = 1;
        } else if (roman == 'V'){
            result = 5;
        } else if (roman == 'X'){
            result = 10;
        } else if (roman == 'L'){
            result = 50;
        } else if (roman == 'C'){
            result = 100;
        } else if (roman == 'D'){
            result = 500;
        } else if (roman == 'M'){
            result = 1000;
        }
        return result;
    }
}
