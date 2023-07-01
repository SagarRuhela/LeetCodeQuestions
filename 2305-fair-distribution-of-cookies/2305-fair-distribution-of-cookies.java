class Solution {
    int ans;
    int count[];
    public int distributeCookies(int[] cookies, int k) {
        ans=Integer.MAX_VALUE;
         count=new int[k];
        helper(cookies,0,k);
        return ans;
    }
    public  void helper(int cookies[],int index,int k){
        if(index==cookies.length){
            int max=Integer.MIN_VALUE;
            for(int i:count){
                max=Math.max(max,i);
            }
            ans=Math.min(ans,max);
            return;
        }
        for(int i=0;i<k;i++){
        count[i]=count[i]+cookies[index];
         helper(cookies,index+1,k);
         count[i]=count[i]-cookies[index];  
         if(count[i]==0){
             break;
         }
        }
    }
}