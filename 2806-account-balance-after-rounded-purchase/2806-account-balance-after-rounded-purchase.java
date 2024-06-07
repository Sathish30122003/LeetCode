class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
      if(purchaseAmount<10){
        if(purchaseAmount<5)
        return 100;
        else
        return 90;
      }
      else{
        int n=purchaseAmount%10;
        if(n<5)
        return 100-(purchaseAmount-n);
        else
        return 100-(purchaseAmount-n+10);
      
      }

    }
}