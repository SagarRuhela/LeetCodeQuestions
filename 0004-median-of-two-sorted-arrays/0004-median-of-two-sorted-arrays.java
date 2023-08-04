class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else if(nums1[i]>nums2[j]){
                arr[k]=nums2[j];
                k++;
                j++;
            }
            else{
                arr[k]=nums1[i];
                i++;
                k++;
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
           arr[k]=nums1[i];
                k++;
                i++; 
        }
        while(j<n){
             arr[k]=nums2[j];
                k++;
                j++;
        }
        if((n+m)%2!=0){
            double ans=arr[(n+m)/2];
            return ans;
        }
        else{
            double n1=arr[(n+m)/2];
            double n2=arr[(n+m)/2-1];
            double ans=(n1+n2)/2;
            return ans;
        }
    }
}