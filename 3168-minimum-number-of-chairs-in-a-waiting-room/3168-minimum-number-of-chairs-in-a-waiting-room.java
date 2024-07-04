class Solution {
    public int minimumChairs(String s) {
     int max=0;
     int chair=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='E')
        chair++;
        else
        chair--;
        max=Math.max(max,chair);
     }   
     return max;
    }
}