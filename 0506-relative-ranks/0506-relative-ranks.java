class Solution {
    public String[] findRelativeRanks(int[] score) {
      int temp[]=new int[score.length];
      System.arraycopy(score, 0, temp, 0, score.length);
      HashMap<Integer,Integer> map=new HashMap<>();
      Arrays.sort(temp);
      int o=1;
      for(int i=score.length-1;i>=0;i--){
            map.put(temp[i],o++);
        
      }
     // System.out.println(map);
    String ans[]=new String[score.length];
    for(int i=0;i<score.length;i++){
        int ran=map.get(score[i]);
        if(ran==1)
        ans[i]="Gold Medal";
        else if(ran==2)
        ans[i]="Silver Medal";
        else if(ran==3)
        ans[i]="Bronze Medal";
        else{
            ans[i]=String.valueOf(ran);
        }
    }
      return ans; 

    }
}