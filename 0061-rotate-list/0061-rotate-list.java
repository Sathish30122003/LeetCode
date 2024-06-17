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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        return head;
        if(head.next==null)
        return head;
        ListNode a=head;
        int count=0;
        while(a!=null){
            count++;
            a=a.next;
        }
         k=k%count;

       for(int i=0;i<k;i++){
        ListNode head1=head;
        while(head1.next!=null&&head1.next.next!=null){
            head1=head1.next;
        }
        ListNode temp=head1.next;
        head1.next=null;
//System.out.println(temp.val);
        temp.next=head;
        head=temp;
       } 
       return head;
    }
}