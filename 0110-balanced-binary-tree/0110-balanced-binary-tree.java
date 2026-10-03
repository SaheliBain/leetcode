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
    public int maxheight(TreeNode root)
    {
        if(root==null) return 0;
        int lheight=maxheight(root.left);
        int rheight=maxheight(root.right);
        return 1+Math.max(lheight,rheight);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int leftH=maxheight(root.left);
        int rightH=maxheight(root.right);

        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        if(Math.abs(leftH-rightH)<=1 && left && right) return true;
        return false;
        
    }
}