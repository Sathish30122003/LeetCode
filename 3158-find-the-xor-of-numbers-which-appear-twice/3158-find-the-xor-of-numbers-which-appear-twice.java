class Solution {
    public int duplicateNumbersXOR(int[] nums) {
     int arr[]=new int[50+1];
     for(int i=0;i<nums.length;i++){
        arr[nums[i]]++;
     } 
     int ans=0;
     for(int i=1;i<=50;i++){
        if(arr[i]>1){
            ans=ans^i;
        }
     }  
     return ans;
    }
}