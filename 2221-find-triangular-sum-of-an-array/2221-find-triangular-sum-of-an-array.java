class Solution {
    public int triangularSum(int[] nums) {
     for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length-1-i;j++){
               nums[j]=nums[j]+nums[j+1];
             //  System.out.print(nums[j]+" "+j+" ");
        }
        System.out.println();
     } 
     return nums[0]%10;  
    }
}