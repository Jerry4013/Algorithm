/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/21
 **/
public class E_70_ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 2;
        for (int i = 2; i < n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

}
