class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int count=0;
        if(costs[0]>coins) return 0;
        for(int i=0; i<costs.length; i++){
            sum=sum+costs[i];
            if(sum>coins){
                return count;
            }else{
                count++;
            }
        }
        return count;
    }
}