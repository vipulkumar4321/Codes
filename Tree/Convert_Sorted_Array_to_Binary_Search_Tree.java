//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
                return null;
        return helperSortedArrayToBST(nums, 0, nums.length-1);
    }
    
    public static TreeNode helperSortedArrayToBST(int[] nums, int l, int h) {
        if(l > h) {
            return null;
        }
        
        int mid = l + (h-l)/2;
        
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left = helperSortedArrayToBST(nums, l, mid-1);
        temp.right = helperSortedArrayToBST(nums, mid+1, h);
        
        return temp;
    }
}
