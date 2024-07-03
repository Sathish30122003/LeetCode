class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
      int ans[]=new int[nums.length];
      int right[]=new int[nums.length];
      int left[]=new int[nums.length];
      List<Integer> arr=new ArrayList<>();
      for(int i=nums.length-1;i>=0;i--){
        if(arr.contains(nums[i])){
            right[i]=arr.size();
        }
        else{
            right[i]=arr.size();
            arr.add(nums[i]);
        }
      }
        arr.clear();
        for(int i=0;i<nums.length;i++){
        if(arr.contains(nums[i])){
            left[i]=arr.size();
        }
        else{
            
            arr.add(nums[i]);
            left[i]=arr.size();
        }
      }
      for(int i=0;i<nums.length;i++){
        ans[i]=left[i]-right[i];
      }
      return ans;
    }
}