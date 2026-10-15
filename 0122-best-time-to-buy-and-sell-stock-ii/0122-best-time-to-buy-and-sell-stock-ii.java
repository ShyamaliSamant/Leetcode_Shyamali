class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int profit = 0;
        // int buy= 0;
        // for(int i =0; i<n-1; i++){
        //     if(p[i] == p[i+1]) return 0;
        //    if(p[i] >p[i+1]){
        //     buy = p[i+1];
        //    }
        //    if(p[i] < p[i+1]){ 
        //     buy = p[i];
        //    }
        //    int sell =p[i+1];
        //    profit += sell-buy;
        // }
        // return profit;
        for(int i =1; i<n; i++){
            if(p[i] > p[i-1]){
                profit += p[i] -p[i-1];
            }
        }
        return profit;
    }
}