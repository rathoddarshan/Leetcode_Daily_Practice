class Solution {
    public boolean isValidBST(TreeNode root) {
        return ans(root, null, null);
    }

    private boolean ans(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        return ans(root.left, low, root.val) && ans(root.right, root.val, high);
    }
}