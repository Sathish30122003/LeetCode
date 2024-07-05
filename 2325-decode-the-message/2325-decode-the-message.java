class Solution {
    public String decodeMessage(String key, String message) {
     HashMap<Character,Character> map=new HashMap<>();
     char t='a';
     for(int i=0;i<key.length();i++){
        if(key.charAt(i)==' ')
        continue;
        if(!map.containsKey(key.charAt(i))){
            map.put(key.charAt(i),t);
            t++;
        }
     } 
     //System.out.println(map);
     String ans="";
     for(int i=0;i<message.length();i++){
        if(message.charAt(i)==' ')
        ans+=' ';
        else{
            ans+=map.get(message.charAt(i));
        }
     } 
     return ans; 
    }
}