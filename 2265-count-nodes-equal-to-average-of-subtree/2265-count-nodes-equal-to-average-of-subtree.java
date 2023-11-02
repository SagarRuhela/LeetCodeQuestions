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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        pair temp =helper(root);
        return ans;
    }
    public pair helper(TreeNode root){
        if(root==null){
            return new pair(0,0);
        }
        pair left=helper(root.left);
        pair right=helper(root.right);
        int curSum= left.sum + right.sum +root.val;
        int count=left.count + right.count +1;
        if((curSum/count)==root.val){
            ans++;
        }
        return new pair(curSum,count);
    }
    class pair{
        int sum;
        int count;
        public pair(int sum,int count){
            this.count=count;
            this.sum=sum;
        }
        public pair(){

        }
    }
}