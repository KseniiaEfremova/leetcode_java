public class SumRootLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return rootToLeaf(root, 0);
    }

    public int rootToLeaf(TreeNode root, int parent_val) {

        if (root == null) {
            return 0;
        }
        int total = parent_val*10 + root.val;
        if (root.left == null && root.right == null){
            return total;
        }
        return rootToLeaf(root.left, total) + rootToLeaf(root.right, total);
    }
}
