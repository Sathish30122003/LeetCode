class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>0&&nums[i+1]<=nums[i]){
        
            i--;
        }
         int j=nums.length-1;
        if(i>=0){
           
            while(nums[i]>nums[j])
            j--;
             System.out.println(i+" "+j);
            swap(nums,i,j);
        }
        if(i==0&&j==0)
        reverse(nums,0);
        else
        reverse(nums,i+1);    
    }
    void swap(int arr[],int a,int b){
         int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
         System.out.println("fg");
    }
    void reverse(int arr[],int a){
        int b=arr.length-1;
        while(a<b){
            swap(arr,a,b);
            a++;
            b--;
        }
    }
}