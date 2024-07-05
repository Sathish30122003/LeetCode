class Solution {
    public int deleteGreatestValue(int[][] grid) {
     for(int i=0;i<grid.length;i++){
        Arrays.sort(grid[i]);
     } 
     int ans=0; 
     for(int i=grid[0].length-1;i>=0;i--){
        int max=Integer.MIN_VALUE;
        //System.out.println("0");
        for(int j=grid.length-1;j>=0;j--){
            max=Math.max(max,grid[j][i]);
        }
        System.out.println(max);
        ans+=max;
        
     }
     return ans; 
    }
}