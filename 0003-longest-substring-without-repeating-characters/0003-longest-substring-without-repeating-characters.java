class Solution {
    public int lengthOfLongestSubstring(String s) {
       int arr[]=new int[128];
       int ans=0;
       for(int i=0,j=0;j<s.length();j++){
        arr[s.charAt(j)]++;
        while(arr[s.charAt(j)]>1){
            --arr[s.charAt(i++)];
        }
        ans=Math.max(ans,j-i+1);
       } 
       return ans;
    }
}