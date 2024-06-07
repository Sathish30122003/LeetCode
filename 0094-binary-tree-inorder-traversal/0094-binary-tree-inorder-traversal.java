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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> arr=new ArrayList<>();
       find(root,arr);
       return arr; 
    }
    void find (TreeNode r,List<Integer> arr){
        if(r==null)
        return;
        find(r.left,arr);
        arr.add(r.val);
        find(r.right,arr);
    }
}