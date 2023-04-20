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
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    public  void helper1(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list1.add(root.val);
        }
        helper1(root.left);
        helper1(root.right);
        return;
    }
      public  void helper2(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list2.add(root.val);
        }
        helper2(root.left);
        helper2(root.right);
        return;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper1(root1);
        helper2(root2);
        if(list1.size()!=list2.size()){
            return false;
        }
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i)){
                return false;
            }
        }
         
        return true;
    }
}