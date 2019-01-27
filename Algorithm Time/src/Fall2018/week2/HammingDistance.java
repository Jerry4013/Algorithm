package Fall2018.week2;

public class HammingDistance {
    public static void main(String[] args) {
        new HammingDistance().run();
    }

    private void run() {
        System.out.println(hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        long longX = Integer.toUnsignedLong(x);
        long longY = Integer.toUnsignedLong(y);
        int ans = 0;
        while (longX != 0 || longY != 0){
            int tempX = (int) (longX & 1);
            int tempY = (int) (longY & 1);
            if (tempX != tempY){
                ans++;
            }
            longX = longX >> 1;
            longY = longY >> 1;
        }
        return ans;
    }
}
