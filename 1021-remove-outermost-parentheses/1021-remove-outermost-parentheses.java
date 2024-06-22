class Solution {
    public String removeOuterParentheses(String s) {
     String ans="";
     int count=0;
     for(int i=1;i<s.length();i++){
        if(s.charAt(i)=='('){
            count++;
            ans+=s.charAt(i);
        }
        else if(s.charAt(i)==')'&&count>=1){
           ans+=s.charAt(i);
           count--;
        }
        else{
            i++;
        }
       // System.out.println(count);
     }  
     return ans; 
    }
}