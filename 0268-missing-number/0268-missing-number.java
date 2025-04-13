class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
    for(int i=0;i<n;i++){
        if(nums[i]!=i){
            int t=nums[i];
            if(t>=n)
            continue;
            nums[i]=nums[nums[i]];
            nums[t]=t;
            i--;
        }
    }
    for(int i=0;i<nums.length;i++){
        if(i!=nums[i]){
            return i;
        }
    }
    return nums.length;    
    }
}