class Solution {
    public int minOperations(int[] nums) {
        int m=nums.length;
        Set<Integer> set=new HashSet<>();
       for(int i=0;i<m;i++){
           set.add(nums[i]);
       } 
       int arr[]=new int[set.size()];
       int idx=0;
       int minAns=Integer.MAX_VALUE;
       for(int i:set){
           arr[idx++]=i;
       }
       Arrays.sort(arr);
       int n=arr.length;
       for(int i=0;i<n;i++){
           int left= arr[i];
           int right=left+m-1;
           int idexOfRight=BS(arr,right);
           int count=idexOfRight-i;
         minAns=Math.min(minAns,m-count);
       }
       return minAns;
    }
    public int BS(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid+1;
            }
            else  if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}