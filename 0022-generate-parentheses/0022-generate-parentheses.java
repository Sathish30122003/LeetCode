/*class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> li=new ArrayList<>();
     find("",n,li); 
     return li;  
    }
    void find(String s,int n,List <String> arr){
      if(s.length()>n*2){
        return;
      }
      if(s.length()==n*2){
        if(check(s))
       { 
        System.out.println(check(s));
        arr.add(s);}
        return;
      }
      find(s+"(",n,arr);
      find(s+")",n,arr);
    }
boolean check(String s) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            st.push(s.charAt(i));
        } else if (!st.isEmpty() && s.charAt(i) == ')') {
            st.pop();
        } else {
            st.push(s.charAt(i));
        }
    }
    return st.isEmpty();
}

}*/
class Solution {
    public List<String> generateParenthesis(int n) {
       List<String>lt=new ArrayList<>();
       String s="";
       generate(s,n,lt,0,0); 
       return lt;
    }
    void generate(String s,int n,List<String>lt,int open,int close){
        if(open<n){
            generate(s+"(",n,lt,open+1,close);
        }
        if(close<open){
            generate(s+")",n,lt,open,close+1);
        }
        if(s.length()==n*2){
                lt.add(s);
                return;
        }
    }
}