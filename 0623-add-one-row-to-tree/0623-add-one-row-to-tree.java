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
    TreeNode left;
    TreeNode right;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode newNode=new TreeNode(val,root,null);
            return newNode;
        }
        helper(root,val,depth-1);
        return root;
    }
    public void helper(TreeNode root, int val, int depth){
        if(root==null){
            return;
        }
        if(depth==1){
            this.left=root.left;
            this.right=root.right;
           
                TreeNode newLeft=new TreeNode(val,left,null);
             root.left=newLeft;
            
            
                TreeNode newRight=new TreeNode(val,null,right);
                root.right=newRight;
            
            return;
        }
        helper(root.left,val,depth-1);
        helper(root.right,val,depth-1);
    }
}