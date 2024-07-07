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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode a=head;
        if(head==null)
        return a;
        while(a.next!=null){
            ListNode p=new ListNode(GCD(a.val,a.next.val));
            p.next=a.next;
            a.next=p;
            a=p.next;
        }
        return head;
    }
      int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}