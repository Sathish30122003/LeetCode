class Solution {
    public int[] evenOddBit(int n) {
     String s=Integer.toBinaryString(n);
     int ans[]=new int[2];
     for(int i=0;i<s.length();i++){
        if(i%2==0&&s.charAt(i)=='1')
        ans[1]++;
        if(i%2==1&&s.charAt(i)=='1')
        ans[0]++;
     } 
     return ans;  
    }
}