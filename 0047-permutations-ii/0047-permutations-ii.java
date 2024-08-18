class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> arr=new ArrayList<>();
       find(nums,0,nums.length-1,arr);
       return arr; 
    }
    void find(int arr[],int st,int en,List<List<Integer>> li){
           if(st==en){
            List<Integer> te=new ArrayList<>();
            for(int i=0;i<=en;i++){
                te.add(arr[i]);
            }
            if(li.contains(te))
            return;
            li.add(te);
           }
           else{
            for(int i=st;i<=en;i++){
              int t=arr[st];
              arr[st]=arr[i];
              arr[i]=t;
              find(arr,st+1,en,li);
              t=arr[st];
              arr[st]=arr[i];
              arr[i]=t;
            }
           }
    }
}