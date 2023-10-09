class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int [2];
        arr[0]=First(nums,target);
        arr[1]=Second(nums,target);
        return arr;
    }

   public static int First(int[] arr, int target){
       int index=-1;
       int si=0;
       int ei=arr.length-1;
       while(si<=ei){
           int mid=(si+ei)/2;
           if(arr[mid]>=target){
               ei=mid-1;
           }
           else{
               si=mid+1;
           }
           if(arr[mid]==target){
               index=mid;
           }
       }
       return index;
   } 

   public static int Second(int[] arr1, int target){
       int index=-1;
       int si=0;
       int ei=arr1.length-1;
       while(si<=ei){
           int mid=(si+ei)/2;
           if(arr1[mid]<=target){
               si=mid+1;
           }
           else{
               ei=mid-1;
           }
           if(arr1[mid]==target){
               index=mid;
           }
       }
       return index;
   } 
}