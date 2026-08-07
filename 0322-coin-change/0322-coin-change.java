class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int coin : coins) {
            for (int currAmount = coin; currAmount <= amount; currAmount++) {

                if (dp[currAmount - coin] != Integer.MAX_VALUE) {

                    dp[currAmount] = Math.min(
                        dp[currAmount],
                        1 + dp[currAmount - coin]
                    );
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}