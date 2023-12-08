//Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int i,n=prices.length;
        int max=-1,p=0;
        int min=prices[0];
        for(i=1;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
                max=prices[i];
            }
            if(prices[i]>max)
                max=prices[i];
            if(max-min>p)
                p=max-min;
        }
        return p>0?p:0;
    }
}