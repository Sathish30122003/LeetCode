class Solution {
    public int secondHighest(String s) {
     List<Integer> arr=new ArrayList<>();
     for(int i=0;i<s.length();i++){
       if(s.charAt(i)>=48&&s.charAt(i)<=57){
        arr.add(s.charAt(i)-'0');
       }
     }  
     Collections.sort(arr);
     System.out.println(arr);
     int max=arr.get(arr.size()-1);
     for(int i=arr.size()-1;i>=0;i--){
        if(max>arr.get(i))
        return arr.get(i);
     } 
     return -1;
    }
}