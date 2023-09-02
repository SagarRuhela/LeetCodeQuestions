class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set=new HashSet(Arrays.asList(dictionary));
        int dp[]=new int[s.length()+1];
        for(int i=s.length()-1;i>=0;i--){
            dp[i]=dp[i+1]+1;// don't consider the current char'
        // consider the curr char and check wheather any word which is formed by it is present in dictionary or not
        for(int j=i;j<s.length();j++){
            String temp=s.substring(i,j+1);
            if(set.contains(temp)){
                dp[i]=Math.min(dp[i],dp[j+1]);
            }
        }
        }
        return dp[0];
    }
}