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
     Integer pre=null;
     int min=Integer.MAX_VALUE;
     void inorder(TreeNode r){
        if(r==null)return;
        inorder(r.left);
        if(pre!=null){
            min=Math.min(min,r.val-pre);
        }
        pre=r.val;
        inorder(r.right);
     }

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
}