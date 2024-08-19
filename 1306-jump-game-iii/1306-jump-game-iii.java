class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> qu=new LinkedList<>();
        qu.add(start);
        while(qu.size()!=0){
            int fr=qu.poll();
            if(arr[fr]==0)
            return true;
            if(arr[fr]<0)
            continue;
            if(fr+arr[fr]<arr.length)
            qu.add(fr+arr[fr]);
            if(fr-arr[fr]>=0)
            qu.add(fr-arr[fr]);
            arr[fr]=-arr[fr];
        }
        return false;
    }
}