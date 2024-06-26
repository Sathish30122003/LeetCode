class Solution {
    public int[] singleNumber(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int ans[]=new int[2];
      for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
          }
          else{
              map.put(nums[i],1);
          }
      }
        Set<Integer> ans1=map.keySet();
        int i=0;
        
        for(Integer a:ans1){
            if(map.get(a)==1){
              ans[i++]=a; 
            }
        }
        return ans;
    }
}