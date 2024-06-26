class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
      int len=nums1.length;
      int len1=nums2.length;
      int xr1=0;
      for(int i=0;i<nums1.length;i++){
        xr1=xr1^nums1[i];
      }
      int xr2=0;
      for(int i=0;i<nums2.length;i++){
        xr2=xr2^nums2[i];
      }
      if(len%2==0&&len1%2==0)
      return 0;
     // System.out.println(xr1+" "+xr2+" "+(xr1^xr2));
     if(len%2==0&&len1%2!=0)
     return xr1;
   if(len%2!=0&&len1%2!=0)
   return (xr1^xr2);
      return xr2;
    }
}