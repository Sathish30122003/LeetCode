class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
       for(int i=0;i<s.length();i+=(k*2)){
        if((i+k)>s.length()){
            swap(ch,i,s.length()-1);
        }
        else
          swap(ch,i,i+k-1);

       } 
       String str=new String(ch);
       return str;
    }
    void swap(char arr[],int st,int en){
        for(int i=st;i<en;i++){
            char c=arr[i];
            arr[i]=arr[en];
            arr[en]=c;
            en--;
        }
    }
}