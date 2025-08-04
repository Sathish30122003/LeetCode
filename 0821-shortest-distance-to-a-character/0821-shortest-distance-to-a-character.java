class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            char c1=s.charAt(i);
            if(c==c1)
            arr[i]=i;
            else if(i<s.length()-1)
            arr[i]=arr[i+1];
            else
            arr[i]=s.length();
        }
        int tra=s.indexOf(c);
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(c1==c){
            arr[i]=0;
            tra=i;
            continue;
            }
            else {
            arr[i]=Math.min(Math.abs(tra-i),Math.abs(arr[i]-i));
            }
        }
        return arr;
    }
}