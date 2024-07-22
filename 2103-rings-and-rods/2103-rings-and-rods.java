class Solution {
    public int countPoints(String rings) {
    String arr[]=new String[10];
    Arrays.fill(arr,"");
    for(int i=0;i<rings.length()-1;i+=2){
        String c="";
        c+=rings.charAt(i);
        int idx=rings.charAt(i+1)-'0';
     
        if(!arr[idx].contains(c))
        arr[idx]+=c;
    }  
    int count =0;
    for(int i=0;i<10;i++){
        if(arr[i].length()>2)
        count++;
    }  
    return count;
    }
}