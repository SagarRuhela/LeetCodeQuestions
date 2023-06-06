class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length<=2){
            return true;
        }
       Arrays.sort(arr);
       int diff=Math.abs(arr[0]-arr[1]);
       for(int i=1;i<arr.length-1;i++){
           int newDiff=Math.abs(arr[i]-arr[i+1]);
           if(diff!=newDiff){
               return false;
           }
       } 
       return true;
    }
}