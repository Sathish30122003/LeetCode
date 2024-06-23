class Solution {
    public int countSegments(String s1) {
   String s=s1.trim();
        if(s.length()==0)
        return 0;
        String arr[]=s.split("\\s+");
        for(String a:arr)
        System.out.println(a);
        return arr.length;
    }
}