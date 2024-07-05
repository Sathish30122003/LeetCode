class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        a:
    for(int i=0;i<words.length;i++){
        String s=words[i];
      // HashMap<String,Integer> hm=new HashMap<>();
        for(int j=0;j<s.length();j++){
            if(!allowed.contains(Character.toString(s.charAt(j))))
            continue a;
        }
        count++;
    }   
    return count; 
    }
}