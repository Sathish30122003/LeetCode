class Solution {
    public int findCenter(int[][] edges) {
     int a=edges[0][0],a1=0;
     int b=edges[0][1],b1=0;
     for(int i=1;i<edges.length;i++){
        for(int j=0;j<2;j++){
            if(edges[i][j]==a)
            a1++;
            else if(edges[i][j]==b)
            b1++;
        }
     }
     if(a1>b1)
     return a;
     else return b;   
    }
}