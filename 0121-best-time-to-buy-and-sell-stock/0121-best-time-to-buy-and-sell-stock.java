class Solution {
    public int maxProfit(int[] prices) {
       int arr[]=new int[prices.length];
       int l[]= new int[prices.length];
       int n=prices.length;
       l[n-1]=prices[n-1];
       for(int i=n-2;i>=0;i--){
        l[i]=Math.max(l[i+1],prices[i]);
       }
       for(int i=0;i<n;i++){
        arr[i]=Math.abs(l[i]-prices[i]);
       }
       return Arrays.stream(arr).max().getAsInt();
    }
}