class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int time=arr.length/4;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
                if(count>time){
                return arr[i];
            }
            }
            else{
                count=1;
            }
            
        }
        return -1;
    }
}