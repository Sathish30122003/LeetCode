class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            System.out.println(j);
            if(nums[i]+nums[j]==k&&Math.abs(i-j)<=k)
            return true;
        }
     }   
    return false;
    }
}