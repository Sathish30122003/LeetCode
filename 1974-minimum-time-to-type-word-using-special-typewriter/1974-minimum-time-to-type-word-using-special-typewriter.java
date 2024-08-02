class Solution {
    public int minTimeToType(String word) {
      char arr[]=word.toCharArray();
      char curr='a';
      int count=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==curr)
        count++;
        else {
            int a=Math.abs(arr[i]-curr);
           // System.out.println(a);
            if(a>13)
            count+=(26-a)+1;
            else
            count+=(a+1);
            curr=arr[i];
          //  System.out.println(count);
        }
      }
return count;
    }
}