class Solution {
    public int hIndex(int[] nums) {
        int k=1;
        if(nums[nums.length-1]==0)
        return 0;
       for(int i=nums.length-1;i>=0;i--){
        System.out.println(k);
       if(nums[i]<k)
       break;
       k++;
       }
       return --k;
    }
}