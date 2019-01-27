public class E_101_SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null && right != null){
            return false;
        }
        if (left != null && right == null){
            return false;
        }
        if (left.val == right.val){
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }
        return false;
    }
}
