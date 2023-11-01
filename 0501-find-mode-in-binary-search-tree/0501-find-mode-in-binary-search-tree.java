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
    HashMap<Integer,Integer> map;
    public int[] findMode(TreeNode root) {
        map=new HashMap<>();
        helper(root,map);
        int max=0;
        for(int i:map.keySet()){
            max=Math.max(max,map.get(i));
        }
        List<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==max){
               list.add(i);
            }
        }
    int arr[]=new int[list.size()];
    int j=0;
    for(int i:list){
        arr[j++]=i;
    }
    return arr;
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
    return;
}
}