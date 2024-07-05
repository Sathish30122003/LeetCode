class Solution {
    public int minimumPushes(String word) {
       int count=0;
       int i=1;int len=word.length();
       while(len>8){
        len-=8;
        count=count+(i*8);
        i++;
        System.out.println(count);
       } 
       count=count+(i*len);
       return count;
    }
}