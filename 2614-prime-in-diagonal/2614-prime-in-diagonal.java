class Solution {
    public int diagonalPrime(int[][] nums) {
      int prime=0;
      List<Integer> arr=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[0].length;j++){
            if(i==j){
                arr.add(nums[i][j]);
                

            }
            if(i+j==nums.length-1)
            {
             arr.add(nums[i][j]); 
            }
           
        }
      } 
      Collections.sort(arr);
      
      for(int i=arr.size()-1;i>=0;i--){
        if(prime(arr.get(i)))
        return arr.get(i);
      }
      return 0;

    }
    boolean prime(int a)
    {
        if(a==0||a==1)
        return false;
        for(int i=2;i<=a/2;i++){
            if(a%i==0)
            return false;
        }
          return true;
    }
}