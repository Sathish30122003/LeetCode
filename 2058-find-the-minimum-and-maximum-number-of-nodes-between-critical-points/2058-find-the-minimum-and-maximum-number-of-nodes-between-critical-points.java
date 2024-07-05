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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
      List<Integer> arr=new ArrayList<>();
      int pre=head.val;
      int i1=2;
      while(head.next!=null){
        if((pre>head.val&&head.val<head.next.val)||(pre<head.val&&head.val>head.next.val))
        arr.add(i1-1);
        pre=head.val;
        head=head.next;
        i1++;
      }  
      System.out.println(arr);
      int ans[]={-1,-1};
      if(arr.size()>1){
        int max=arr.get(arr.size()-1)-arr.get(0);
        int min=max;
        for(int i=0;i<arr.size()-1;i++){
           if((arr.get(i+1)-arr.get(i))<min) {
            min=arr.get(i+1)-arr.get(i);
           }
        }
        ans[0]=min;
        ans[1]=max;
      }
      return ans;
    }
}