/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 import java.util.ArrayList;
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null ){
            return false;
        }
        boolean b=false;
       ListNode fast=head;
       ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            if(fast.next==slow){
                b=true;
                break;
            }
            fast=fast.next.next;
             slow=slow.next;
           
        }
        if(b){
           return true;
        }
        else{
            return false;
        }
    }
}