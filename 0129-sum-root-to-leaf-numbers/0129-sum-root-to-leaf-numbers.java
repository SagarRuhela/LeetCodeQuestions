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
    public static int helper(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        sum=sum*10 +root.val;
        if(root.left==null && root.right==null){
            return sum;
        }
       int leftsum= helper(root.left,sum);
        int rightsum=helper(root.right,sum);
        return leftsum+rightsum;
    }
    public int sumNumbers(TreeNode root) {
        
        int sum=0;
       int ans= helper(root,sum);
       return ans;
        
    }
}