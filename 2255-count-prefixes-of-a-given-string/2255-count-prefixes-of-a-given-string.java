class Solution {
    public int countPrefixes(String[] words, String s) {
      int count=0;
      a:
      for(int i=0;i<words.length;i++){
        String str=words[i];
        
        for(int j=0;j<str.length();j++){
            if(s.charAt(j)!=str.charAt(j))
            continue a;
        }
        count++;
      }  
      return count;
    }
}