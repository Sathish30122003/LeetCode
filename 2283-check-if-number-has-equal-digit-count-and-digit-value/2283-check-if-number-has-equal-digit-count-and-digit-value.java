class Solution {
    public boolean digitCount(String num) {
    int arr[]=new int[10];
    for(int i=0;i<num.length();i++){
        arr[num.charAt(i)-'0']++;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }    
    for(int i=0;i<num.length();i++){
       int n=num.charAt(i)-'0';
       if(arr[n]!=num.charAt(num.charAt(arr[n])-'0')-'0')
       return false;
    }
    return true;
    }
}