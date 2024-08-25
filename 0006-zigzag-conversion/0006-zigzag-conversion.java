class Solution {
    public String convert(String s, int r) {
        if(r==1||s.length()==1)
        return s;
      char arr[][]=new char[r][(s.length()/2)+1]; 
      for(int i=0;i<r;i++){
        Arrays.fill(arr[i],' ');
      }
      int cor=0,idx=0,last=0;
      for(int j=0;j<(s.length()/2)+1;j++){
         if(idx>=s.length())
         break;
        if(j==cor){
        for(int i=0;i<r&&idx<s.length();i++){
            arr[i][j]=s.charAt(idx++);
            }
            
            cor=cor+r-1;
            
             last=r-2;
        }
        else{
            arr[last--][j]=s.charAt(idx++);
        }
      }
      String ans=""; 
      for(int i=0;i<r;i++){
        for(int j=0;j<s.length()/2+1;j++){
            if(arr[i][j]!=' ')
            ans+=arr[i][j];
        }
      }
      return ans;
    }
}