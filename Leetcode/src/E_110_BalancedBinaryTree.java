/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/24
 **/
public class E_110_BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(hight(root.left) - hight(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    private static int hight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(hight(root.left), hight(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);
        boolean balanced = isBalanced(root);
        System.out.println("balanced = " + balanced);

    }
}
