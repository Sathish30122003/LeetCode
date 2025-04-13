class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            if(t!=-1 && t!=i+1){
                if(nums[t-1]==t){
                nums[i]=-1;
                continue;
                 }
                 nums[i]=nums[t-1];
                 nums[t-1]=t;
                 i--;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==-1)
            li.add(i+1);
        }
        return li;
    }
}