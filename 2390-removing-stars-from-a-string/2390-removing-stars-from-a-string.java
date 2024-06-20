class Solution {
    public String removeStars(String s) {
      String s1="";
      int count=0;
      for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)=='*'){
            count++;
            continue;
        }
        if(count>0){
            i=i-count+1;
            count=0;
            continue;
        }
        else{
            s1=s.charAt(i)+s1;
        }
      }  
      return s1;
    }
}