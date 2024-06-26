class Solution {
    public int largestCombination(int[] candidates) {
    int bit[]=new int[32]; 
    Arrays.fill(bit,0);
    for(int i=0;i<candidates.length;i++){
       for(int j=0;j<32;j++){
        int m=(candidates[i]&(1<<j));
        if(m!=0)
        bit[j]++;
       }
    } 
   return  Arrays.stream(bit).max().getAsInt();
    }
}