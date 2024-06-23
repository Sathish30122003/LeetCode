class Solution {
    public int hammingDistance(int x, int y) {
        
     String s=Integer.toBinaryString(x);
     String str1= String.format("%32s", s).replace(' ', '0');
    // System.out.println(str1.length());
     String s1=Integer.toBinaryString(y);
     String str2 = String.format("%32s", s1).replace(' ', '0');
     int count=0;
     //System.out.println(str1);
     //System.out.println(str2);
     for(int i=31;i>=0;i--){
        if(str1.charAt(i)!=str2.charAt(i)){
            count++;
        }
     }
     
     return count;
    }
}