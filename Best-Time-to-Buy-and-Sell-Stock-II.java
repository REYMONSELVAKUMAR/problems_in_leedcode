class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>min){
                max+=(prices[i]-min);
                min=prices[i];
            }
            else{
                min=prices[i];
            }
        }
        return max;
    }
}