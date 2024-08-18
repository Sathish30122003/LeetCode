class Solution {
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> li=new ArrayList<>();
     sol(n,k,li,new ArrayList<>(),1);
     return li;   
    }
    void sol(int n,int k,List<List<Integer>> li,List<Integer> te,int st){
        if(te.size()==k){
            li.add(new ArrayList<>(te));
            return;
        }
        for(int i=st;i<=n;i++){
            te.add(i);
            sol(n,k,li,te,i+1);
            te.remove(te.size()-1);
        }
    }
}