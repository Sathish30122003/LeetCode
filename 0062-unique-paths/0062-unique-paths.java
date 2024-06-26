class Solution {
    public int uniquePaths(int m, int n) {
      int dp[][]=new int[m+1][n+1];
      for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(i==1||j==1){
                dp[i][j]=1;
            }
            else if(i==2){
                dp[i][j]=j;
            }
            else{
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
      }  
      for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
      }
      return dp[m][n];
    }
}