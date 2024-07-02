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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer> arr1=new ArrayList<>();
       List<Integer> arr2=new ArrayList<>();
       findleaf(root1,arr1);
       findleaf(root2,arr2);
     
       if(arr1.size()!=arr2.size())
       return false;

      return arr1.equals(arr2);
    }

    void findleaf(TreeNode r,List<Integer> arr){
        if(r==null)
        return ;
        if(r.left==null&&r.right==null){
            arr.add(r.val);
        }
        findleaf(r.left,arr);
        findleaf(r.right,arr);
    }
}