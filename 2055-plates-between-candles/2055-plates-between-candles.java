class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n=s.length();
        int []fin=new int[queries.length];
        int[]plt=new int[n];
        int []lp=new int[n];
        int rp[]=new int[n];
        int pt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                pt++;
            }plt[i]=pt;
        }int left=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                left=i;
            }lp[i]=left;
        }int right=-1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='|'){
                right=i;
            }rp[i]=right;
        }for(int i=0;i<queries.length;i++){
            int st=queries[i][0];
            int e=queries[i][1];
            int p1=rp[st];
            int p2=lp[e];
            if(p1!=-1&&p2!=-1 && p1<p2){
                fin[i]=plt[p2]-plt[p1];
            }else{
                fin[i]=0;
            }
        }return fin;
        
        
    }
}