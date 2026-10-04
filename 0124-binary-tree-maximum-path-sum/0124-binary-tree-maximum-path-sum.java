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
    public int maxi;
    public int helper(TreeNode root)
    {
        if(root==null) return 0;
        int left=Math.max(0,helper(root.left));
        int right=Math.max(0,helper(root.right));
        maxi=Math.max(maxi,left+right+root.val);
         return Math.max(left,right)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        maxi=Integer.MIN_VALUE;
        if(root==null) return 0;
        helper(root);
        return maxi;
    }
}