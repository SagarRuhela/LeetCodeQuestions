class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (s1, s2)->{
            if(s1.length()==s2.length()) return s1.compareTo(s2); //lexicograhically comaparison
            else return s1.length()-s2.length();
        });
        int ans=0;
        dp=new Integer[words.length];
        //debug
        // System.out.println(Arrays.toString(words));
        for(int i=0; i<words.length; i++) {
            ans=Math.max(ans, 1+util(words, i));
        }
        return ans;
    }
    private Integer dp[];
    private int util(String words[], int i) {
        if(dp[i]!=null) return dp[i];

        int ret=0;
        for(int j=i; j<words.length; j++) {
            if(check(words[i], words[j])) {
                ret=Math.max(ret, 1+util(words, j));
            }
        }
        return dp[i]=ret;
    }
    private boolean check(String pred, String word) {
        if(pred.length()+1!=word.length()) return false;
        boolean oneDiff=false;
        for(int i=0, j=0; j<word.length() && i<pred.length(); j++) {
            if(pred.charAt(i)==word.charAt(j)) {
                i++;
            }else {
                if(oneDiff) {
                    //more than one different character
                    return false;
                }
                oneDiff=true;
            }
        }
        return true;
    }
}