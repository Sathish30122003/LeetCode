class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    int min=Integer.MAX_VALUE;
    List<List<Integer>> li=new ArrayList<>();  
    for(int i=0;i<arr.length-1;i++){
        int abs=arr[i+1]-arr[i];
        if(abs==min){
        li.add(new ArrayList<>());
        li.get(li.size()-1).add(arr[i]);
        li.get(li.size()-1).add(arr[i+1]);
        }
        else if(min>abs){
            li.clear();
            li.add(new ArrayList<>());
            li.get(li.size()-1).add(arr[i]);
            li.get(li.size()-1).add(arr[i+1]);
            min=abs;
        }
    }  
    return li;
    }
}