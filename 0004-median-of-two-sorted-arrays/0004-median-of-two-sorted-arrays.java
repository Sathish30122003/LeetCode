class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int num[]=new int[nums1.length+nums2.length]; 
       int i=0,j=0,k=0;
       while(i<nums1.length&&j<nums2.length){
        if(nums1[i]<nums2[j]){
            num[k++]=nums1[i++];
        }
        else if(nums1[i]>nums2[j])
        num[k++]=nums2[j++];
       
       else{
         num[k++]=nums1[i++];
         num[k++]=nums2[j++];
       }
       }
       while(i<nums1.length){
        num[k++]=nums1[i++];
       }
       while(j<nums2.length){
        num[k++]=nums2[j++];
       }
         int a=num.length;
            int b=a/2;
       if(num.length%2==0)
       {
        return (double)(num[b-1]+num[b])/2;
       }
       return num[(a-1)/2];
    }
}