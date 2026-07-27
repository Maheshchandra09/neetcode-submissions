class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            if(prices[i]>buy){
                maxp = Math.max(maxp, prices[i] - buy);     
            }
        }
        // for(int i=0;i<prices.length;i++){
        //     int  pricetoday = prices[i];
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]>pricetoday){
        //             maxp = Math.max(maxp, prices[j] - pricetoday);
        //         }
        //     }
        // }
        return maxp;
    }
}
