class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int len=nums1.length+nums2.length;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i][0]==nums2[j][0])
                    len--;
            }
        }
        int ans[][]=new int[len][2];
        int st=0;
        int en=0,i=0;
        while(st<nums1.length&&en<nums2.length){
            if(nums1[st][0]==nums2[en][0]){
                int ans1=nums1[st][1]+nums2[en][1];
                ans[i][0]=nums1[st][0];
                ans[i][1]=ans1;
                i++;
                st++;
                en++;
            }
            else if(nums1[st][0]<nums2[en][0]){
                ans[i][0]=nums1[st][0];
                ans[i][1]=nums1[st][1];
                i++;
                st++;
            }
             else if(nums1[st][0]>nums2[en][0]){
                ans[i][0]=nums2[en][0];
                ans[i][1]=nums2[en][1];
                i++;
                en++;
            }
        }
        while(st<nums1.length){
          ans[i][0]=nums1[st][0];
                ans[i][1]=nums1[st][1];
                i++;
                st++;  
        }
        while(en<nums2.length){  ans[i][0]=nums2[en][0];
                ans[i][1]=nums2[en][1];
                i++;
                en++;}
        return ans;
    }
}