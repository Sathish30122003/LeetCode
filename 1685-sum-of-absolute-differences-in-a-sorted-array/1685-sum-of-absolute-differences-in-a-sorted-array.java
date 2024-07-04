class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
      int left[]=new int[nums.length];
      int right[]=new int[nums.length];
      int n=nums.length;
      left[0]=0;
      for(int i=1;i<nums.length;i++){
         left[i]=left[i-1]+nums[i-1];
      }  
      right[nums.length-1]=0;
      for(int i=nums.length-2;i>=0;i--){
        right[i]=right[i+1]+nums[i+1];
      }
      int ans[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        System.out.println(right[i]+" "+left[i]);
        ans[i]=Math.abs((right[i]-nums[i]*(n-i-1))-(left[i]-nums[i]*i));
      }
      return ans;
    }
}