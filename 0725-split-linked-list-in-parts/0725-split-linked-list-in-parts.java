/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode ans[]=new ListNode[k];
        int count=0;
        ListNode temp1=head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        int extra =count%k;
        int size=count/k;
        ListNode temp2=head;
            ListNode prev=null;
        for(int i=0;temp2!=null && i<k;i++){
            int total;
            if(extra>0){
             total=size+1;
                extra--;
                }
            else{
                total=size;
            }
           ans[i]=temp2;
            while(total>0 ){
                total--;
                prev=temp2;
                temp2=temp2.next;
            }
            prev.next=null;
                if(temp2!=null){
                head=temp2;
                }
        
        }
        return ans;
    }
}