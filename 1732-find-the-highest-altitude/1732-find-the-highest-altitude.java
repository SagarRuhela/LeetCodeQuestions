class Solution {
    public int largestAltitude(int[] gain) {
        int atn=0;
        int maxA=0;
        for(int i=0;i<gain.length;i++){
            atn=atn+gain[i];
            maxA=Math.max(maxA,atn);
        }
        return maxA;
    }
}