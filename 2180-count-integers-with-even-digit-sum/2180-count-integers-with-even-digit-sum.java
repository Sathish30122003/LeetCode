class Solution {
    int count=0;
    public int countEven(int num) {
      for(int i=1;i<=num;i++){
        if(i<=9&&i%2==0)
        count++;
        else{
            helper(i);
        }
      } 
      return count; 
    }
    void helper(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        if(sum%2==0)
        count++;
    }
}