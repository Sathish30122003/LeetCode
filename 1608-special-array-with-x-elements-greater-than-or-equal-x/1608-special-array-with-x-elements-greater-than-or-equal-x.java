class Solution {
    public int specialArray(int[] nums) {
    for(int i=0;i<=nums.length;i++){
        int x=0;
        for(int j:nums){
            if(j>=i)
            x++;
        }
        if(x==i)
        return x;
    }
    return -1;
    }
}