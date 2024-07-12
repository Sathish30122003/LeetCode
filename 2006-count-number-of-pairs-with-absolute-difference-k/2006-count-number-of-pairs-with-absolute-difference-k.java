class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int  I=0;I<nums.length-1;I++) {
            for(int j=I+1;j<nums.length;j++) {
                if(nums[I]-nums[j]==k||nums[j]-nums[I]==k) 
                    count++;
                }
            
            
            }
        return count;
        
    }
}