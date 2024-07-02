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
    public int deepestLeavesSum(TreeNode root) {
      Queue<TreeNode> qu=new LinkedList<>();
      qu.add(root); 
      List<Integer> arr=new ArrayList<>();
     
      while(qu.size()!=0) {
        int size=qu.size();
        int sum=0;
        
        for(int i=0;i<size;i++){
            TreeNode cur=qu.poll();
            sum+=cur.val;
            if(cur.left!=null)
            qu.add(cur.left);
            if(cur.right!=null)
            qu.add(cur.right);
        }
        arr.add(sum);
      }
      return arr.get(arr.size()-1);
    }
}