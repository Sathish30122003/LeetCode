class Solution {
    public int minKBitFlips(int[] nums, int k) {
     int check=0;
     int count=0;
     int ite=0;
     for(int i=0;i<nums.length-k+1;i++){
        //System.out.println(ite+" "+count);
       if(check%2==0&&nums[i]==0&&ite<k){
        count++;
        check=1;
        ite=1;
        //System.out.println("1-");
        continue;
       }
       if(check%2==1&&nums[i]==1&&ite<k){
        count++;
        check=1;
        ite=1;
       // System.out.println("2-");
        continue;
       }
       if(nums[i]==0&&ite>=k){
        count++;
        check=1;
        ite=1;
        //System.out.println("3-");
        continue;
       }
       ite++;

       
     }
     for(int i=nums.length-k;i<nums.length;i++){
        if(nums[i]==0&&check%2==0)
        return -1;
     }  
     return count; 
    }
}