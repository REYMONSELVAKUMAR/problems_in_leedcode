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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        f(root,l);
        return l;
    }
    public void f(TreeNode t,List<Integer>l){
        if(t!=null){
            f(t.left,l);
            f(t.right,l);
            l.add(t.val);
        }
    }
}