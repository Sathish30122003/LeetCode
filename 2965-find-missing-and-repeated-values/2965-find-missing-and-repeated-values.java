class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
     int arr[]=new int[grid.length*grid[0].length];
     int k=0;
     int ans[]=new int [2];
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            arr[k++]=grid[i][j];
        }
     } 
     Arrays.sort(arr);
     ans[1]=arr[arr.length-1]+1;
     for(int i=0;i<arr.length-1;i++){
        if(arr[i]==arr[i+1])
        ans[0]=arr[i];
       
     }
     int o=1;
     for(int i=0;i<arr.length;i++){
        if(arr[i]!=o){
            if(i>0&&arr[i]==arr[i-1])
            continue;
            else{
                ans[1]=o;
                break;
            }
        }
        o++;
        System.out.println(o);
     }
     return ans;  
    }
}