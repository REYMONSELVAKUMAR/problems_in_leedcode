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
    TreeNode h=null,c=null;
    public TreeNode increasingBST(TreeNode r) {
        if(r==null)return r;
        increasingBST(r.left);
        if(h==null){
            h=r;
            c=r;
        }
        else{
            c.right=r;
           
            c=c.right;
        }
         c.left=null;
        increasingBST(r.right);
        return h;
    }
}