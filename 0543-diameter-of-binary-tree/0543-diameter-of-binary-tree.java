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
    public static class findDiameter{
        int diameter;
        int height;
    }
    public static findDiameter helper(TreeNode root){
        if(root==null){
            findDiameter ans=new findDiameter();
            ans.diameter=0;
            ans.height=0;
            return ans;
        }
        findDiameter left=helper(root.left);
        findDiameter right=helper(root.right);
        int height=Math.max(left.height,right.height)+1;
        int diameter=left.height+ right.height;
        findDiameter ans=new findDiameter();
        ans.diameter=Math.max(diameter,Math.max(left.diameter,right.diameter));
        ans.height=height;
        return ans;
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter ans=helper(root);
        return ans.diameter;
    }
}