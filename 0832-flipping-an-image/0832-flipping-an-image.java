class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     int ans[][]=new int [image.length][image[0].length];
     for(int i=0;i<image.length;i++){
        int l=image[0].length-1;
        for(int j=0;j<image[0].length;j++){
            ans[i][j]=1^image[i][l];
            l--;
        }
        System.out.println();
        
     }   
     return ans;
    }
}