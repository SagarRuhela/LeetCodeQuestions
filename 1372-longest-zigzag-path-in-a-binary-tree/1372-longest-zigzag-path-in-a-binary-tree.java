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
    public static class three{
        int forward=-1;
        int backward=-1;
        int maxLength=0;
    }
    public static three helper(TreeNode root){
        if(root==null){
            three ans=new three();
            return ans;
        }
       three leftans=helper(root.left);
       three rightans=helper(root.right);
        int maxLength=Math.max(Math.max(leftans.maxLength,rightans.maxLength),Math.max(
        leftans.backward,rightans.forward)+1);
        int forward=leftans.backward+1;
        int backward=rightans.forward+1;
        three ans =new three();
        ans.forward=forward;
        ans.backward=backward;
        ans.maxLength=maxLength;
        return ans;
    }
    public int longestZigZag(TreeNode root) {
     three ans=helper(root);
        return ans.maxLength;
        
    }
}