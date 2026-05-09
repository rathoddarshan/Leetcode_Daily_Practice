/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int res = Integer.MAX_VALUE;
    List<Integer> ls = new ArrayList<>();
    
    public int getMinimumDifference(TreeNode root) {

        fillList(root);

        Collections.sort(ls);

        return result();

    }
    private void fillList(TreeNode root) {
        if(root == null) return;
        
        ls.add(root.val);
        fillList(root.left);
        fillList(root.right);
    }
    private int result(){
        for(int i=1; i<ls.size(); i++){
            int l1 = ls.get(i);
            int l2 = ls.get(i-1);

            int diff = Math.abs(l1-l2);
            if(res>diff){
                res = diff;
            }
        }

        return res;
    }
}