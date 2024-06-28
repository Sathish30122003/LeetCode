class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int ans[]=new int[arr.length];
    System.arraycopy(arr,0,ans,0,arr.length);
     Arrays.sort(arr);
      
      HashMap<Integer,Integer> map=new HashMap<>();
      int o=1;
      for(int i=0;i<arr.length;i++){
      if(map.containsKey(arr[i]))
      continue;
      else
        map.put(arr[i],o++);
      }
      
      for(int i=0;i<ans.length;i++){
        ans[i]=map.get(ans[i]);
      }
      return ans;

    }
}