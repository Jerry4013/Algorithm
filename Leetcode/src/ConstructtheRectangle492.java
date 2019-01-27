public class ConstructtheRectangle492 {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int root = (int) Math.sqrt(area);
        while (area % root != 0){
            root--;
        }
        result[0] = area / root;
        result[1] = root;
        return result;
    }
}
