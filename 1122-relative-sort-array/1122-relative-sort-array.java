class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<arr1.length;i++){
        if(map.containsKey(arr1[i])){
            map.put(arr1[i],map.get(arr1[i])+1);
        }
        else{
            map.put(arr1[i],1);
        }
     }
     List<Integer> ar=new ArrayList<>();
     HashMap<Integer,Integer> map1=new HashMap<>();
     for(int i=0;i<arr2.length;i++){
        map1.put(arr2[i],1);
     }
     for(int g:arr1){
        if(!map1.containsKey(g))
        ar.add(g);
     }
     int k=0;
     for(int i=0;i<arr2.length;i++){
        int a=arr2[i];
        int len=map.get(a);
        while(len>0){
            arr1[k++]=a;
            len--;
        }
     }   
      Collections.sort(ar);
     for(int i=0;i<ar.size();i++){
        arr1[k++]=ar.get(i);
     }
     return arr1;
    }
}