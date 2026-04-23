class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int res=0;
        while(r<prices.length){
            if(prices[l] <= prices[r]){
                res = Math.max(res,prices[r]-prices[l]);r++;
            }
            else{l=r;}
        }
        return res;
    }
    public int maxProfitOverall(int[] prices){
        int min=1000;
        int res=0;
        for(int i=0;i<prices.length;i++){
            if( min<= prices[i]){
                res += (prices[i]-min); min= prices[i];
            }
            else{
                min=prices[i];
            }
        }
        return res;
    }
}
