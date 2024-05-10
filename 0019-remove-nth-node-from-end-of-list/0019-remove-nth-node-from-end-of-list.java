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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
         ListNode temp1=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int len=c-n;
       if(c==1&&n==1){
        ListNode s=null;
        return s;
       }
       if(c>1&&n==c){
        return head.next;
       }
       if(c>1&&n==1){
        int count=1;
        while(count<len){
           temp1=temp1.next;
           count++;
        }
        temp1.next=null;
        return head;
       }
       else{
        int count=1;
        while(count<len){
           temp1=temp1.next;
           count++;
        }
        temp1.next=temp1.next.next;
        return head;
       }
       
    }
}