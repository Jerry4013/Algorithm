/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/21
 **/
public class E_69_SqrtX {
    public static int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        double guess = x / 2;
        double difference = guess * guess - x;
        if (difference < 0) {
            difference = -difference;
        }
        while ( difference > 0.1 ) {
            guess = ( guess + x / guess ) / 2;
            difference = guess * guess - x;
            if (difference < 0) {
                difference = -difference;
            }
        }
        return (int)guess;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(224));
    }
}
