class Solution {
    public int countElements(int[] nums) {
        int count=0;
    for(int i=0;i<nums.length;i++){
      int sm=0,lg=0;
      for(int j=0;j<nums.length;j++){
        if(i!=j&&lg==0&&nums[i]>nums[j])
        lg=1;
        if(i!=j&&sm==0&&nums[i]<nums[j])
        sm=1;
        if(sm==1&&lg==1)
        break;
      } 
      if(sm==1&&lg==1)
      count++;
    }  
    return count;
    }
}