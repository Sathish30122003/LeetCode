class Solution {
    public int largestRectangleArea(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(st.size()!=0&&height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=0;
            }
            else{
                left[i]=st.peek()+1;
            }
            st.push(i);
            
        }
        st.clear();
        for(int i=height.length-1;i>=0;i--){
            while(st.size()!=0&&height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=height.length-1;
            }
            else{
                right[i]=st.peek()-1;
            }
            st.push(i);
            
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            int width=(right[i]-left[i]+1);
            int area=height[i]*width;
            max=Math.max(max,area);
        }
       
        return max;
    }
}