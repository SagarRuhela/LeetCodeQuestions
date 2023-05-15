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
    public ListNode Insert(ListNode root,int val){
        ListNode temp=new ListNode(val);
        temp.next=root;
        root=temp;
        return root;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int count=1;
        ListNode temp1=head;
        while(temp1.next!=null){
            count++;
            temp1=temp1.next;
        }
        int arr[]=new int[count];
        ListNode temp2=head;
        int i=0;
        while(temp2!=null){
            arr[i]=temp2.val;
            i++;
            temp2=temp2.next;
        }
        int temp=arr[k-1];
        arr[k-1]=arr[count-k];
        arr[count-k]=temp;
        ListNode root=null;
        for(int j=count-1;j>=0;j--){
            root=Insert(root,arr[j]);
        }   
        return root;
    }
}