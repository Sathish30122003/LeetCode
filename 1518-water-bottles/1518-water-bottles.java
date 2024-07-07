class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numExchange<=numBottles){
            int new1=numBottles/numExchange;
            int rem=numBottles%numExchange;
            sum=sum+new1;
            numBottles=new1+rem;
        }
        return sum;
    }
}