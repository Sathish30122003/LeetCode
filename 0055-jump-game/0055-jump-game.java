class Solution {
    public boolean canJump(int[] nums) {
        return find(nums, nums[0], 0);
    }

    boolean find(int[] nums, int ele, int idx) {
        if (idx >= nums.length - 1) {
            return true;
        }
        if (nums[idx] == 0) {
            return false;
        }
        for (int i = 1; i <= nums[idx]; i++) {
            if (find(nums, nums[idx + i], idx + i)) {
                return true;
            }
        }
        return false;
    }
}
