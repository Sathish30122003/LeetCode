class Solution {
    public int countLargestGroup(int n) {
     int arr[]=new int[36+1];
     for(int i=1;i<=n;i++){
        if(i>9){
            int temp=sum(i);
            arr[temp]++;
        }
        else
        arr[i]++;
     } 
     int max=Arrays.stream(arr).max().getAsInt();
     int count=0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==max)
        count++;
     } 
     return count; 
    }
    int sum(int a){
        int temp=0;
        while(a>0){
            int rem=a%10;
            temp+=rem;
            a/=10;
        }
        return temp;
    }
}