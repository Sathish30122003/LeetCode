class Solution {
    public int longestOnes(int[] nums, int k) {
      int count=0;
      int max=0,l=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==1){
            count++;
            max=Math.max(count,max);
            continue;
            }
            while(k==0){
                if(nums[l]==0)
                k++;
                count--;
                l++;
            }
            if(nums[i]==0&&k>0){
                count++;
                k--;
            }
            max=Math.max(count,max);

      }  
      return max;
    }
}