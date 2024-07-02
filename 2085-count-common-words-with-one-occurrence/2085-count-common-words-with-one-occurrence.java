class Solution {
    public int countWords(String[] word1, String[] word2) {
     HashMap<String,Integer> map=new HashMap<>();
    
        for(int i=0;i<word1.length;i++){
            if(map.containsKey(word1[i])){
                map.put(word1[i],map.get(word1[i])+1);
            }
            else{
                map.put(word1[i],1);
            }
        }
        HashMap<String,Integer> map1=new HashMap<>();
        for(int i=0;i<word2.length;i++){
            if(map1.containsKey(word2[i])){
                map1.put(word2[i],map1.get(word2[i])+1);
            }
            else{
                map1.put(word2[i],1);
            }
        }
        int count=0;
      Set<String> st=map.keySet();
      for(String f:st){
        if(map.get(f)==1){
            try{
                if(map1.get(f)==1)
                count++;
                else  
                continue;
            }
            catch(Exception e){

            }
        }
      }
      return count;
        
    }
}