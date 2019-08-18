import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: Jingchao Zhang
 * @createDate: 2019/07/25
 **/
public class E_112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        List<Integer> list = sum(root);
        for (Integer integer : list) {
            if (integer == sum) {
                return true;
            }
        }
        return false;
    }

    private List<Integer> sum(TreeNode node) {
        if (node == null) {
            return null;
        }
        if (node.left == null && node.right == null) {
            ArrayList<Integer> sums = new ArrayList<>();
            sums.add(node.val);
            return sums;
        }
        if (node.left == null) {
            List<Integer> right = sum(node.right);
            return right.stream().map(integer -> node.val + integer).collect(Collectors.toList());
        }
        if (node.right == null) {
            List<Integer> left = sum(node.left);
            return left.stream().map(integer -> node.val + integer).collect(Collectors.toList());
        }
        List<Integer> left = sum(node.left).stream().map(integer -> node.val + integer).collect(Collectors.toList());
        List<Integer> right = sum(node.right).stream().map(integer -> node.val + integer).collect(Collectors.toList());
        left.addAll(right);
        return left;
    }
}
