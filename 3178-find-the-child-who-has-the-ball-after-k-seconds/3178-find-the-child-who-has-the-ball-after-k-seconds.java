class Solution {
    public int numberOfChild(int n, int k) {
     Stack<Integer> st=new Stack<>();
     int t=0,flag=0;
     for(int i=0;i<=k;i++){
        if(flag==0){
            st.push(t);
        }
       
        if(flag==1){
            st.pop();
        }
         if(t==n-1){
            flag=1;
        }
        if(st.size()==1){
            t=0;
            flag=0;
        }
        t++;
        
     }  
     return st.peek();
    }
}