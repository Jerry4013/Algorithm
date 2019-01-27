public class E_404_SumOfLeftLeaves {
    public static void main(String[] args) {
        new E_404_SumOfLeftLeaves().run();
    }

    private void run() {
        TreeNode root = new TreeNode(1);
        TreeNode left = root.setLeft(2);
        TreeNode right = root.setRight(3);
        TreeNode left1 = left.setLeft(4);
        TreeNode right1 = left.setRight(5);

    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode setLeft(int left) {
            this.left.val = left;
            return this.left;
        }

        public TreeNode getRight() {
            return right;
        }

        public TreeNode setRight(int right) {
            this.right.val = right;
            return this.right;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 0;
        }
        if (root.left == null){
            return sumOfLeftLeaves(root.right);
        }
        if (root.left != null){
            return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
        return 0;
    }


}
