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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<len;i++){
                TreeNode temp=queue.remove();
                max=Math.max(max,temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}