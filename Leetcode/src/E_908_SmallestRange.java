public class E_908_SmallestRange {
    public int smallestRangeI(int[] A, int K) {
        int max = 0;
        int min = 10000;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        int result = (max - K) - (min + K);
        if (result < 0){
            return 0;
        }
        return result;
    }
}
