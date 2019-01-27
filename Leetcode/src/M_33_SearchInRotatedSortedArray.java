public class M_33_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 1){
            if (target == nums[0]){
                return 0;
            }
            return -1;
        }
        if (nums.length == 2){
            if (target == nums[0]){
                return 0;
            }
            if (target == nums[1]){
                return 1;
            }
            return -1;
        }
        int pivot = findPivot(nums, 0, nums.length - 1);
        if (pivot == -1){
            return bs(nums, 0, nums.length -1 , target);
        }
        int left = bs(nums, 0, pivot, target);
        if ( left != -1){
            return left;
        }
        int right = bs(nums, pivot + 1, nums.length - 1, target);
        if (right != -1){
            return right;
        }
        return -1;
    }

    public int findPivot(int[] nums, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if (mid + 1 == nums.length){
            return -1;
        }
        if (mid-1 <0)
            return -1;
        if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]){
            return mid;
        }
        int right =  findPivot(nums, mid + 1, end);
        int left = findPivot(nums, start, mid-1);
        if (right != -1){
            return right;
        }
        if (left != -1){
            return left;
        }
        return -1;
    }

    public int bs(int[] nums, int start, int end, int target){
        if (start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if (nums[mid] == target){
            return mid;
        }
        if (nums[mid] < target){
            return bs(nums, mid + 1, end, target);
        }
        if (nums[mid] > target){
            return bs(nums, start, mid-1, target);
        }
        return -1;
    }
}
