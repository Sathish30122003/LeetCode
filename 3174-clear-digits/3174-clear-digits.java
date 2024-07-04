class Solution {
    public String clearDigits(String s) {
     List<Character> arr=new ArrayList<>();
     for(char d:s.toCharArray()){
        arr.add(d);
     }
     for(int i=0;i<arr.size();i++){
        if(Character.isDigit(arr.get(i))){
              arr.remove(i);
              arr.remove(i-1);
              i=0;
          
        }
     }  
     String ans="";
     for(int i=0;i<arr.size();i++){
        
        ans+=arr.get(i);
     } 
     return ans;
    }
}