class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
      int xr1=0;
      for(int i=0;i<arr1.length;i++){
        xr1=xr1^arr1[i];
      } 
      int xr2=0;
       for(int i=0;i<arr2.length;i++){
        xr2=(xr2^arr2[i]);
      } 
      return(xr1&xr2);
    }
}