class Solution {
    public int[] diStringMatch(String s) {
       int len=s.length();
       int k=len;
       int arr[]=new int[len+1];
       int i=0;
       for(int j=0;j<len;j++){
        if(s.charAt(j)=='I')
        arr[j]=i++;
        else
        arr[j]=k--;
       } 
       arr[len]=i;
       return arr;
    }
}