class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       
      for(int i=0;i<heights.length;i++){
        int min=i;
        for(int j=i+1;j<heights.length;j++){
            if(heights[min]<heights[j])
            min=j;
        }
        int t=heights[i];
        heights[i]=heights[min];
        heights[min]=t;
        String h=names[min];
        names[min]=names[i];
        names[i]=h;
       
      }
    
      return names;
    }
}