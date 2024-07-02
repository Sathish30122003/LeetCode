class Solution {
    public int distinctAverages(int[] nums) {
      Arrays.sort(nums);
      HashSet<Double> set=new HashSet<>();
      int p1=0,p2=nums.length-1;
      while(p1<p2){
        double avg=((double)nums[p1++]+(double)nums[p2--])/2;
       // System.out.println(avg+" "+nums[p1-1]+" "+nums[p2+1]);
        set.add(avg);
      }  
      return set.size();
    }
}