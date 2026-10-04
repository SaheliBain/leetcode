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
        if(Math.abs(lheight-rheight)>1)
            return -1;
        //checking child
        if(lheight==-1 || rheight==-1)
            return -1;
        return 1+Math.max(lheight,rheight);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return maxheight(root)!=-1;
        
    }
}