class Solution {
    public int maxArea(int[] height) {
      int p1=0,p2=height.length-1;
     // int arr[]=new int[height.length];
      int n=height.length;
      int max=Integer.MIN_VALUE;
      while(p1<p2){
        int len=p2-p1;
        int a=Math.min(height[p1],height[p2]);
        int vol=len*a;
        max=Math.max(max,vol);
        if(height[p1]<=height[p2])
        {p1++;
        p2=n-1;
       // System.out.println(p1);
        }
        else if(height[p1]>height[p2])
        p2--;

      }  
      return max;
    }
}