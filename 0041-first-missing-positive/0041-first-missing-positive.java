class Solution {
    public int firstMissingPositive(int[] nums) {
     int n=nums.length;
     for(int i=0;i<n;i++){
        int t=nums[i];
        if(t<n && t>0 && nums[t-1]!=t){
            nums[i]=nums[t-1];
            nums[t-1]=t;
            i--;
        }
     } 
     
     for(int i=0;i<n;i++){
        if(i+1!=nums[i])
        return i+1;
        
     }
     return n+1;  
    }
}