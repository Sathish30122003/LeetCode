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
    public int sumRootToLeaf(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        int ans=find(root,0);
        return ans;
    }
    int find(TreeNode node,int sum){
        if (node == null) {
            return 0;
        }
        
        // Calculate the current path sum
        sum = (sum << 1) | node.val;
        
        // If it's a leaf node, return the current sum
        if (node.left == null && node.right == null) {
            return sum;
        }
        
        
        int leftSum = find(node.left, sum);
        int rightSum = find(node.right, sum);
        
      
        return leftSum + rightSum;
        
        
    }
}