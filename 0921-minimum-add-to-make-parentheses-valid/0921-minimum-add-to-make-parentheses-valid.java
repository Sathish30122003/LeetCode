class Solution {
    public int minAddToMakeValid(String s) {
     Stack<Character> arr=new Stack<>();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
           arr.push('(');
        }
        else if(arr.size()>0&&arr.peek()=='('){
            arr.pop();
        }
        else{
            arr.push(')');
        }
     }  
     return arr.size(); 
    }
}