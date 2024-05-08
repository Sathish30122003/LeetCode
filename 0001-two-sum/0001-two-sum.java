class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int[] arr=new int[2];
        int n1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
            n1=nums[i]+nums[j];
            if(n1==target){
                arr[0]=i;
                arr[1]=j;
             return arr;
            }
            }
            
        }
      return arr;  
    }
}