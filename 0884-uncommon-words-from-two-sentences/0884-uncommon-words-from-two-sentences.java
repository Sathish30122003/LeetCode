class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
     List <String> arr=new ArrayList<>();
      String []arr1=s1.split(" ");
      String []arr2=s2.split(" ");
      String []a=new String[arr1.length+arr2.length];
     
      for(int i=0;i<arr1.length;i++){
        a[i]=arr1[i];
      }
      int k=arr1.length;
      for(int j=0;j<arr2.length;j++){
        a[k++]=arr2[j];
      }
      a:
      for(int i=0;i<a.length-1;i++){
         int flag=0;
        if(a[i].equals(""))
        continue a;
        for(int j=i+1;j<a.length;j++){
            if((a[i].equals(a[j]))){
                flag=1;
                a[j]="";
                
            }   
        }
        if(flag==1)
        {
            a[i]="";
            continue a;
        }
        arr.add(a[i]);
      }
      if(!a[a.length-1].equals(""))
      arr.add(a[a.length-1]);

      String ans[]=new  String[arr.size()];
      for(int i=0;i<arr.size();i++){
        ans[i]=arr.get(i);
      }
      return ans;
    }
}