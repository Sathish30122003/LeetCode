class Solution {
    public int pivotIndex(int[] nums) {
      int num1[]=new int[nums.length];
      int num2[]=new int[nums.length];
      for(int i=1;i<nums.length;i++){
        num1[i]=nums[i-1]+num1[i-1];
      }  
      for(int i=nums.length-2;i>=0;i--){
        num2[i]=nums[i+1]+num2[i+1];
      }
      for(int i=0;i<nums.length;i++){
        if(num1[i]==num2[i])
        return i;
      }
      return -1;
    }
}