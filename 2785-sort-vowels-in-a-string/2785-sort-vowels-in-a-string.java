class Solution {
    public String sortVowels(String s) {
    List<Character> arr=new ArrayList<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||
        s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        arr.add(s.charAt(i));

    } 
    Collections.sort(arr);
    String ans="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||
        s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            ans+=arr.get(0);
            arr.remove(0);
        }
        else{
            ans+=s.charAt(i);
        }
    }   
    return ans;
    }
}