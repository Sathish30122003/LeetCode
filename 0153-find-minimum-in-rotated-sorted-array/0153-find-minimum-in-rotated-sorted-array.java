class Solution {
    public int findMin(int[] nums) {
     int peek=-1;
     for(int i=0;i<nums.length-1;i++)
     {
        if(nums[i]>nums[i+1])
        peek=i;
     }   
     return nums[peek+1];
    }
}