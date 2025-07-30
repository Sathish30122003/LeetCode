class Solution {
    public boolean check(int[] nums) {
       int dev=0,t=0;
       boolean flag=true;
       for(int i=0;i<nums.length-1;i++){
        
        if(nums[i]>nums[i+1]){
        dev++;
        if(flag){
            flag=false;
            t=i;
        }
        }
       } 

      // System.out.println(t+" "+dev);
       if(dev==0 || (dev==1 && nums[0]>=nums[nums.length-1]))
       return true;
       return false;
       
    }
}