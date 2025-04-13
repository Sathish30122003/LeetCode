class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> li=new ArrayList<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        int t=nums[i];
        if(t==-1)
        continue;
        if(i!=t-1 && t==nums[t-1]){
            li.add(t);
            nums[i]=-1;
            continue;
        }
        if(t!=i+1){
            nums[i]=nums[t-1];
            nums[t-1]=t;
            i--;
        }
       
       } 
       return li;
    }
}