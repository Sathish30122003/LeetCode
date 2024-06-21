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
    public int getMinimumDifference(TreeNode root) {
       List<Integer> arr=new ArrayList<>();
        find(root,arr); 
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            int abs=Math.abs(arr.get(i)-arr.get(i+1));
            min=Math.min(abs,min);
        }
        return min;
    }
    void find(TreeNode head,List<Integer> arr){
        if(head==null)
        return;
        arr.add(head.val);
        find(head.left,arr);
        find(head.right,arr);
        return;
    }
}