class Solution {
    public int removeDuplicates(int[] nums) {
      int count=1;
      int t=0;
      for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[t]){
            count++;
            t++;
            nums[t]=nums[i];
        }
      }  
      return count;
    }
}