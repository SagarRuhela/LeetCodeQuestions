class Solution {
    public int bestClosingTime(String customers) {
        int minPenalty=Integer.MAX_VALUE;
        int minPenaltyHour=0;
        int y=0;
        int n=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                y++;
            }
            else{
                n++;
            }
        }
        for(int i=0;i<customers.length();i++){
           int  tempminPenalty=y;
           if(minPenalty>tempminPenalty){
               minPenalty=tempminPenalty;
               minPenaltyHour=i;
           }
            if(customers.charAt(i)=='Y'){
                y--;
            }
            else{
                y++;
            }
        }
        int temp=n;
        if(minPenalty>temp){
            minPenalty=temp;
            minPenaltyHour=customers.length();
        }
        return minPenaltyHour;

    }
}