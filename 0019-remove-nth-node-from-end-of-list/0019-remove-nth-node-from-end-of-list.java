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
    public static int len(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        if(n==0){
            return head;
        }
        int length=len(head);
        if(length==1){
            return null;
        }
        int pos=length-n;
        if(pos==0){
            return head.next;
        }
        
        ListNode temp=head;
        ListNode prev=null;
        while(pos>0 && temp!=null){
         pos--;
         prev=temp;
         temp=temp.next;
        }
        ListNode temp2=temp.next;
        prev.next=temp2;
        return head;
    }
}