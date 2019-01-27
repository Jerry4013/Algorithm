package Fall2018.week1;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        new Container_With_Most_Water().run();
    }

    private void run() {

    }

    public int maxArea(int[] height) {
        return maxArea2(height, height.length);
    }

    private int maxArea2(int[] height, int n){
        if (n == 2){
            return lower(height[0], height[1]);
        }
        int maxAreaForLast = lower(height[0], height[n - 1]) * (n - 1);
        for (int i = 1; i < n - 1; i++) {
            int tempArea = lower(height[i], height[n - 1]) * (n - 1 - i);
            if (tempArea > maxAreaForLast){
                maxAreaForLast = tempArea;
            }
        }
        int lastMax = maxArea2(height, n - 1);
        return maxAreaForLast > lastMax ? maxAreaForLast : lastMax;
    }

    private int lower(int height1, int height2){
        return height1 < height2 ? height1 : height2;
    }
}
