class Solution {
    public boolean isFascinating(int n) {
      String s=String.valueOf(n)+String.valueOf(n*2)+String.valueOf(n*3);
      if(s.length()==9){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
            return false;
            if(map.containsKey(s.charAt(i))){
                return false;
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        return true;
      }
      return false;
        
    }
}