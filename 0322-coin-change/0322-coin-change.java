class Solution {
    int[][] dp;
    int INF = (int)1e9;
    int solve(int[] coins, int idx, int amount) {
        if (amount == 0)
            return 0;
        if (idx < 0)
            return INF;
        if (dp[idx][amount] != -1)
            return dp[idx][amount];
        int notTake = solve(coins, idx - 1, amount);
        int take = INF;
        if (coins[idx] <= amount)
            take = 1 + solve(coins, idx, amount - coins[idx]);
        return dp[idx][amount] = Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length][amount + 1];
        for (int[] row : dp)
            java.util.Arrays.fill(row, -1);
        int ans = solve(coins, coins.length - 1, amount);
        return ans >= INF ? -1 : ans;
    }
}