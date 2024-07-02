class Solution {
    public String kthDistinct(String[] arr, int k) {
     HashMap<String,Integer> map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
     } 
     List<String> arr1=new ArrayList<>();
     for(int i=0;i<arr.length;i++){
        if(map.get(arr[i])==1)
        arr1.add(arr[i]);
     }  
     if(k>arr1.size()){
        return "";
     }
     if(arr1.size()==0)
     return arr[k-1];
     try{
     return arr1.get(k-1);
     }
     catch(Exception e){
        return "";
     }
    }
}