class Solution {
    public int minimumRounds(int[] tasks) {
        int count=1;
        int ans=0;
   Arrays.sort(tasks);
   for(int i=1;i<tasks.length;i++){
       if(tasks[i]==tasks[i-1]){
           count++;
       }
       else{
           if(count==1){
               return -1;
           }
           else if(count%3==0){
             ans=ans+count/3;
           }
           else {
            ans=ans+count/3+1;
           }
           count=1;
       }
   }
   if(count==1){
               return -1;
           }
    else if(count%3==0){
             ans=ans+count/3;
             return ans;
           }
    else {
            ans=ans+count/3+1;
            return ans;
           }
    }
}