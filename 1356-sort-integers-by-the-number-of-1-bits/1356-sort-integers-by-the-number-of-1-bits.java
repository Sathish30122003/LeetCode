class Solution {
    public int[] sortByBits(int[] nums) {
        Arrays.sort(nums);
     int arr[]=new  int[nums.length];
     for(int i=0;i<arr.length;i++){
        arr[i]=Integer.bitCount(nums[i]);
     }  
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
     for(int i=1;i<arr.length;i++){
        int j1=i-1;
        int key=arr[i];
        int key1=nums[i];
        while(j1>=0&&arr[j1]>key){
            arr[j1+1]=arr[j1];
            nums[j1+1]=nums[j1];
            j1--;
        }
        arr[j1+1]=key;
        nums[j1+1]=key1;
     }
   
     return nums;
    }
}