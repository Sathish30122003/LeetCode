class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]!=i+1){
            int t=nums[i];
            if(nums[t-1]==t)
            return t;
            nums[i]=nums[t-1];
            nums[t-1]=t;
        }
       }
       return -1;
    }
}