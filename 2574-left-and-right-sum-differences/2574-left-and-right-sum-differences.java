class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int [nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        int k=1,l=nums.length-2;
        for(int i=0;i<nums.length-1;i++){
            left[k++]=left[i]+nums[i];
            right[l--]=right[nums.length-i-1]+nums[nums.length-i-1];
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=left[i]>right[i]?(left[i]-right[i]):(right[i]-left[i]);
        }
        return ans;
    }
}