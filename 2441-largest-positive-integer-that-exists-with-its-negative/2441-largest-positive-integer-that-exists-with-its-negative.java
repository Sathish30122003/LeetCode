class Solution {
    public int findMaxK(int[] nums) {
     List<Integer> arr1=new ArrayList<>();
     List<Integer> arr2=new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        if(nums[i]<0)
        arr1.add(nums[i]);
        else
        arr2.add(nums[i]);
     }  
     Collections.sort(arr1);
     for(int i=0;i<arr1.size();i++){
        if(arr2.contains(Math.abs(arr1.get(i))))
        return Math.abs(arr1.get(i));
     } 
     return -1;
    }
}