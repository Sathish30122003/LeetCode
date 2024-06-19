class Solution {
    public int[] rearrangeArray(int[] nums) {
      List<Integer> po=new ArrayList<>();
      List<Integer> ne=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            ne.add(nums[i]);
        }
        else{
            po.add(nums[i]);
        }
      }
      int l=0,k=0;
      for(int i=0;i<nums.length;i++){
        if(i%2==0){
            nums[i]=po.get(k++);
        }
        else
        nums[i]=ne.get(l++);
      }  
      return nums;
    }
}