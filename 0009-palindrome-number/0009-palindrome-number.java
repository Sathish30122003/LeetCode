class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,b=x;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
            int a=x%10;
            sum=(sum*10)+a;
            x=x/10;
            }
        }
        if(sum==b)
        return true;
        else
        return false;
        
    }
}