public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        new MaxConsecutiveOnes().run();
    }

    private void run() {
        int[] arr = {0, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 && nums[i] == 1){
                counter++;
                if (counter > max){
                    max = counter;
                }
            }
            if (i != nums.length - 1 && nums[i] == 1){
                counter++;
            }
            else {
                if (counter > max){
                    max = counter;
                }
                counter = 0;
            }
        }
        if (counter == nums.length){
            max = counter;
        }
        return max;
    }
}
