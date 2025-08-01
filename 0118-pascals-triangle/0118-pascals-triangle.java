class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++)
        li.add(new ArrayList<>());
         li.get(0).add(1);
        for(int i=1;i<n;i++){
            li.get(i).add(1);
            for(int j=1;j<i;j++){
                 li.get(i).add(li.get(i-1).get(j-1)+li.get(i-1).get(j));
            }
            li.get(i).add(1);
        }
        return li;
    }
}