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
    int count;
    public int pseudoPalindromicPaths (TreeNode root) {
        count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        helper(root,map);
        return count;
    }
    public void helper(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null){
            return;
        }
        if(map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }
        else{
            map.put(root.val,1);
        }
        helper(root.left,map);
        helper(root.right,map);
        if(root.left==null && root.right==null){
        boolean ans=isPalindromePossible(map);
        if(ans){
            count++;
        }
        }
        map.put(root.val,map.get(root.val)-1);
        if(map.get(root.val)==0){
            map.remove(root.val);
        }
        return;
    }
    public boolean isPalindromePossible(HashMap<Integer,Integer> map){
        if(map.size()==1){
            return true;
        }
        int countEven=0;
        int countOdd=0;
        for(int i:map.keySet()){
            if(map.get(i)%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        if(countOdd==0 || countOdd==1){
            return true;
        }
        else{
            return false;
        }
    }
}