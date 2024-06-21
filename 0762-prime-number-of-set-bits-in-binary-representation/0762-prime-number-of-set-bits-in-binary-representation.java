class Solution {
    public int countPrimeSetBits(int left, int right) {
      int count=0;
      for(int i=left;i<=right;i++){
        int bit=Integer.bitCount(i);
       // System.out.println("lll"+bit);
        //System.out.println(prime(bit));
        if(prime(bit))
        count++;
      }  
      return count;
    }
    boolean prime(int a){
    System.out.println(a);
        if(a==1||a==0)
        return false;
        if(a==2||a==3)
        return true;
        for(int i=2;i<a/2+1;i++){
            if(a%i==0)
            {
            System.out.println("jnjnj");
            return false;}
        }
        return true;
    }
}