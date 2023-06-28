class Solution {
    int count=0;
    public void helper(int arr[],int i){
        if(i==arr.length){
            count++;
        }
        for(int j=i;j<arr.length;j++){
            swap(arr,i,j);
            if(arr[i]%(i+1)==0 || (i+1)%arr[i]==0){
                helper(arr,i+1);
            }
            swap(arr,i,j);
        }
    }
    public int countArrangement(int n) {
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        helper(arr,0);
        return count;
    }
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}