import java.util.Arrays;

/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/23
 **/
public class E_108_ConvertSortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        if (nums.length == 2) {
            TreeNode node = new TreeNode(nums[1]);
            node.left = new TreeNode(nums[0]);
            return node;
        }

        int midIndex = nums.length / 2;
        TreeNode node = new TreeNode(nums[midIndex]);
        int[] left = Arrays.copyOfRange(nums, 0, midIndex);
        node.left = sortedArrayToBST(left);
        int[] right = Arrays.copyOfRange(nums, midIndex + 1, nums.length);
        node.right = sortedArrayToBST(right);
        return node;
    }

    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        sortedArrayToBST(arr);
    }
}
