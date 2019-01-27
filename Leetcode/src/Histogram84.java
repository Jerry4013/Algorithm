import java.util.HashMap;
import java.util.Set;

public class Histogram84 {
    public static void main(String[] args) {
        new Histogram84().run();
    }

    private void run() {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }

    public int largestRectangleArea(int[] heights) {
        HashMap<IndexPair, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            int min = heights[i];
            for (int j = i; j < heights.length; j++) {
                min = Math.min(min, heights[j]);
                hashMap.put(new IndexPair(i, j), min);
            }
        }
        int maxArea = 0, area = 0;
        Set<IndexPair> indexPairs = hashMap.keySet();
        for (IndexPair indexPair : indexPairs) {
            area = hashMap.get(indexPair) * (indexPair.index2 - indexPair.index1 + 1);
            if (area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    private class IndexPair {
        private int index1;
        private int index2;

        public IndexPair(int index1, int index2) {
            this.index1 = index1;
            this.index2 = index2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IndexPair indexPair = (IndexPair) o;

            if (index1 != indexPair.index1) return false;
            return index2 == indexPair.index2;
        }

        @Override
        public int hashCode() {
            int result = index1;
            result = 31 * result + index2;
            return result;
        }
    }
}
