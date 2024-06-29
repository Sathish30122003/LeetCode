class Solution {
    public int countPrimes(int n) {
     boolean ans[]=new boolean[n];
     Arrays.fill(ans,true);
     for(int i=2;i<n;i++){
        if(ans[i]){
            for(int j=i*2;j<n;j=j+i)
            ans[j]=false;
        }
     }
     int count=0;
     for(int i=2;i<n;i++){
        if(ans[i])
        count++;
     }
     return count;
    }
}