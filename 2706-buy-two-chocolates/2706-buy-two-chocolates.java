class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int totalPrice=prices[0]+prices[1];
        if(totalPrice>money){
            return money;
        }
        else{
            return money-totalPrice;
        }
    }
}