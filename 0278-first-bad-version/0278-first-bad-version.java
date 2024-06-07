/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1))
        return 1;
     int mid=0;
     int a=0,b=0;
     int st=1,en=n;
     while(st<en){
      mid=st+(en-st)/2;
      if(isBadVersion(mid)){
   b=mid;
   en=mid-1;
      }
      else{
        a=mid;
        st=mid+1;
        
      }
     }
     
     for(int i=a;i<=b;i++){
        if(isBadVersion(i))
        return i;
        
     }  
     return n;
    }
}