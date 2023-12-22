class Solution {
    public int maxScore(String s) {
        if(s.length()==2){
            if(s.charAt(0)=='1' && s.charAt(1)=='0'){
                return 0;
            }
            if(s.charAt(0)=='0' && s.charAt(1)=='1'){
                return 2;
            }
            return 1;

        }
        int n=s.length();
        int left[]=new int[n];
        int right[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                count++;
            }
            left[i]=count;
        }
        int count1=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                count1++;
            }
            right[i]=count1;
        }
        int ans=0;
        for(int i=1;i<n-1;i++){
           int temp=left[i]+right[i];
           ans=Math.max(ans,temp);
        }
        return ans;
    }
}