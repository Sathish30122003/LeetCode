class Solution {
    public String getEncryptedString(String s, int k) {
      String ans="";
      for(int i=0;i<s.length();i++){
        int idx=(i+k)%s.length();
        
        ans+=s.charAt(idx);
      }  
      return ans;
    }
}