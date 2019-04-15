public class E_374_GuessNumber {
    public int guessNumber(int n) {
       int start = 1;
       int end = n;
       while (start <= end){
           int mid = start + (end - start) / 2;
           if (guess(mid) == 0){
               return mid;
           }
           if (guess(mid) == -1){
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
       return -1;
    }



    private int guess(int guess) {
        return 0;
    }
}
