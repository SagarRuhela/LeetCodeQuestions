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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null){
            return false;
        }
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> pendingNode=new LinkedList<>();
      
        pendingNode.add(root);
        while(!pendingNode.isEmpty()){
            List<Integer> temp1=new ArrayList<>();
            int len=pendingNode.size();
           for(int i=0;i<len;i++){
               TreeNode currNode=pendingNode.remove();
               temp1.add(currNode.val);
           
            if(currNode.left!=null){
                pendingNode.add(currNode.left);
            }
            if(currNode.right!=null){
                pendingNode.add(currNode.right);
            }
           }
            list.add(temp1);
        }
        for(int i=0;i<list.size();i++){
            List<Integer> temp2=list.get(i);
            boolean even=false;
            if(i%2==0){
                even=true;
            }
            if(even){
                int prev=-1;
                for(int in:temp2){
                    //System.out.print(in+",");
                    if(in%2==0){
                        return false;
                    }
                    if(prev!=-1){
                        if(in<=prev){
                            return false;
                        }
                    }
                    prev=in;
                }
            }
            else{
                int prev=-1;
                for(int im:temp2){
                    // System.out.print(im+",");
                    if(im%2!=0){
                        return false;
                    }
                    if(prev!=-1){
                        if(prev<=im){
                            return false;
                        }
                    }
                    prev=im;
                }
            }
            // System.out.println();
        }
        return true;
    }
}