class Solution {
    public int[] findErrorNums(int[] nums) {
    int arr[]=new int[2];
    for(int i=0;i<nums.length;i++){
        int t=nums[i];
        if(t!=-1 && t!=i+1 && nums[t-1]==t)
        {
            arr[0]=t;
            nums[i]=-1;
            continue;
        }
        if(t!=-1 && t!=i+1){
            nums[i]=nums[t-1];
            nums[t-1]=t;
            i--;
        }
        
    } 
    for(int i=0;i<nums.length;i++){
        if(nums[i]==-1){
        arr[1]=i+1;
        break;
    }
    } 
    return arr;  
    }
}