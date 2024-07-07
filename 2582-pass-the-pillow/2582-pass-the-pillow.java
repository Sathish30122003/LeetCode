class Solution {
    public int passThePillow(int n, int time) {
       if(n>time){
        return time+1;
       } 
       else{
        int ans=time;
         n=n-1;
        int flag=0;
        while(time>0){
            time-=n;
            flag^=1;
           // System.out.println(time);
        }
        time+=n;
        flag^=1;
        if(flag==0)
        return time+1;
        return time;

       }
    }
}