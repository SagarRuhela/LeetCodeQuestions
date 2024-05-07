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
    public ListNode doubleIt(ListNode head) {
        ListNode temp2=head;
         ListNode temp1=ReverseLinkedList(temp2);
         ListNode temp=temp1;
         ListNode prev=null;
         System.out.println("here");
        int carry=0;
        while(temp!=null){
         int num=temp.val;
         num=num*2+carry;
         
         
         if(num<10){
            carry=0;
         }
         else{
         carry=1;
        }
        num=num%10;
        temp.val=num;
        prev=temp;
        temp=temp.next;
        }
        if (carry != 0) {
            ListNode extraNode = new ListNode(carry);
            prev.next = extraNode;
        }
         ListNode temp3=ReverseLinkedList(temp1);
         return temp3;        
    }
    public ListNode ReverseLinkedList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
      ListNode smallHead=ReverseLinkedList(head.next);
      head.next.next=head;
      head.next=null;
      return smallHead;

    }
}