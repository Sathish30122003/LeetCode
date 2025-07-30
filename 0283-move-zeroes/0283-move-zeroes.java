class Solution {
    public void moveZeroes(int[] nums) {
      int n=nums.length;
      for(int i=0;i<nums.length-1;i++){
        int t=i;
        if(nums[i]==0){
            while(t<n-1 && nums[t]==0)
            t++;
            nums[i]=nums[t];
            nums[t]=0;
        }
      }  
    }
}