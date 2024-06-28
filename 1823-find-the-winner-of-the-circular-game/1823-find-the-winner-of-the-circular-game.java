class Solution {
    public int findTheWinner(int n, int k) {
      Queue<Integer> qu=new LinkedList<>();
      for(int i=1;i<=n;i++){
        qu.add(i);
      }  
      while(qu.size()!=1){
        for(int i=0;i<k;i++){
            if(i==k-1){
                qu.poll();
                break;
            }
            int temp=qu.poll();
            qu.add(temp);
        }
      }
      return qu.poll();
    }
}