class Solution {
    public String longestCommonPrefix(String[] strs) {
     String s="";
     int idx=0;
     for(int i=0;i<strs.length;i++){
        if(strs[i].length()<strs[idx].length())
        idx=i;
     }  
     a:
     for(int i=0;i<strs[idx].length();i++){
        char a=strs[idx].charAt(i);
        A:
        for(int j=0;j<strs.length;j++){
            if(j==idx)
            continue A;
            else{
                if(strs[j].charAt(i)!=a)
                break a;
            }
        }
        s+=a;

     } 
     return s;
    }
}