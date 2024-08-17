class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> li=new ArrayList<>();
      sol(nums,0,nums.length-1,li);
      return li;  
    }
    void sol(int arr[],int st,int en,List<List<Integer>> li){
        if(st==en){
            List<Integer> dp=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            dp.add(arr[i]);
            li.add(new ArrayList<>(dp));
        }
        else{
            for(int i=st;i<=en;i++){
                int t=arr[st];
                arr[st]=arr[i];
                arr[i]=t;
                sol(arr,st+1,en,li);
                 t=arr[st];
                arr[st]=arr[i];
                arr[i]=t;
            }
        }

    }
}