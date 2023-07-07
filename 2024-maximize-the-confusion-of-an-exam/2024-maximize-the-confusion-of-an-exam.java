class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int tc=0;
        int fc=0;
        int total=0;
        int right=0;
        int left=0;
        for( right=0;right<answerKey.length();right++){
            if(answerKey.charAt(right)=='T'){
                tc++;
            }
            else{
                fc++;
            }
            if(Math.min(tc,fc)>k){
                if(answerKey.charAt(left++)=='T'){
                    tc--;
                }
                else{
                    fc--;
                }
                total=Math.max(total,tc+fc);
            }
            total=Math.max(total,tc+fc);
        }
        if(total==0){
            return fc+tc;
        }
        else{
            return total;
        }
    }
}