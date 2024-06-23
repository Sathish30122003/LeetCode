/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
       List<Integer> arr=new ArrayList<>();
       traversal(root,arr);
       Collections.sort(arr);
       int ft=0,en=arr.size()-1;
       while(ft<en){
        if(arr.get(ft)+arr.get(en)==k){
            return true;
        }
        else if(arr.get(ft)+arr.get(en)>k)
        en--;
        else
        ft++;
       } 
       return false;
    }
    void traversal(TreeNode head,List<Integer> arr){
        if(head==null)
        return ;
        else{
            arr.add(head.val);
            traversal(head.right,arr);
            traversal(head.left,arr);
        }
        return ;
    }
}