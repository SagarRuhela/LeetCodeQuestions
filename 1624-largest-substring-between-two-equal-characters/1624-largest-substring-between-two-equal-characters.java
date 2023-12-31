class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       int arr[]=new int[26];
       for(int i=0;i<26;i++){
           arr[i]=-1;
       }
       int ans=-1;
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(arr[ch-'a']!=-1){
               int max=i-arr[ch-'a']-1;
               ans=Math.max(ans,max);
           }
           else{
           arr[ch-'a']=i;
       } }
           return ans;
    }
}