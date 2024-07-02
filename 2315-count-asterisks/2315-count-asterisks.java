class Solution {
    public int countAsterisks(String s) {
     String arr[]=s.split("[|]");
     int count=0;
     for(int i=0;i<arr.length;i++){
        if(i%2==0)
        {
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='*')
                count++;

            }
        }
     }  
     return count; 
    }
}