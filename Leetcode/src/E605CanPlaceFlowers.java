public class E605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1){
                continue;
            } else if (i + 1 < flowerbed.length && flowerbed[i + 1] == 0){

            }
        }
        return true;
    }
}
