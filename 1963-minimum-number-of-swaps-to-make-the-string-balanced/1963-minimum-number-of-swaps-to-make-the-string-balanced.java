class Solution {
    public int minSwaps(String s) {
      int count=0,swap=0;
      char arr[]=s.toCharArray();
      int len=arr.length-1;
      for(int i=0;i<arr.length;i++){
        if(arr[i]=='[')
        count++;
        else if(arr[i]==']')
        count--;
        if(count==-1){
            count+=2;
            char temp=arr[len];
            arr[len]=arr[i];
            arr[i]=temp;
            swap++;
            len--;
        }
      } 
      return swap; 
    }
}