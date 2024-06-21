class Solution {
    public boolean detectCapitalUse(String word) {
      int count=0;
      for(int i=0;i<word.length();i++){
        if(word.charAt(i)>=65&&word.charAt(i)<=91){
            count++;
        }
      }
       // System.out.println(count);
        if(count==word.length()){
            return true;
        }
        if(count==1){
            return (word.charAt(0)>=65&&word.charAt(0)<=91)?(true):(false);
        }
        if(count==0)
        return true;
        
      return false;
    }
}