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
    public void revList(ListNode head, int left, int right){
        if(right == left) return;
        int m = head.val;
        head.val = head.next.val;
        head = head.next;
        head.val = m;
        revList(head, left, --right);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        for(int i=0; i<left-1; i++){
            curr = curr.next;
        }
        while(right > left){
            revList(curr, left, right--);
        }
        return head;
    }
}