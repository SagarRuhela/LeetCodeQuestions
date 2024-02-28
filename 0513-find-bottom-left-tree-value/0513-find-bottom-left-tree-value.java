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
    int height;
    int val;
    public int findBottomLeftValue(TreeNode root) {
        height=0;
        val=root.val;
       helper(root,0);
       return val;
    }
    public void helper(TreeNode root,int currHeight){
        if(root==null){
            return;
        }
        if(currHeight>height){
            height=currHeight;
            val=root.val;
        }
        helper(root.left,currHeight+1);
        helper(root.right,currHeight+1);
    }

}