class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        if(left.length==0){
            return n-right[0];
        }
        if(right.length==0){
            return left[left.length-1];
        }
        Arrays.sort(left);
        Arrays.sort(right);
        int temp=left[left.length-1];
        int temp1=n-right[0];
        return Math.max(temp,temp1);
    }
}