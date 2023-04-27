class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                ten++;
                if(five>=1){
                    five--;
                }
                else{
                    return false;
                }  
            }
            else if(bills[i]==20){
                twenty++;
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}