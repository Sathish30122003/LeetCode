class Solution {
    public int countDistinctIntegers(int[] nums) {
     int arr[]=new int[nums.length*2];
     int n=arr.length;
    System.arraycopy(nums, 0, arr, 0, nums.length);
     for(int i=nums.length;i<n;i++){
      arr[i]=rev(arr[i-nums.length]);
     }
     for(int i=0;i<n;i++){
        System.out.println(arr[i]+"  ");
     }
     HashSet<Integer> s=new HashSet<>();
     for(int i=0;i<arr.length;i++){
        s.add(arr[i]);
     } 
     return s.size();  
    }
    int rev(int n){
        int sum=0;
       // System.out.println("kj"+n);
        while(n>0){
            int re=n%10;
            sum=sum*10+re;
            n/=10;
        }//System.out.println("kj"+sum);
        return sum;
        
    }
}