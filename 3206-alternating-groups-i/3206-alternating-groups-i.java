class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
      int count=0;
      int n=colors.length;
      for(int i=0;i<n;i++){
        int idx1=(i+1)%n;
        int idx2=(i+2)%n;
        if(colors[i]!=colors[idx1]&&colors[idx1]!=colors[idx2])
        count++;
        
      }  
      return count;
    }
}