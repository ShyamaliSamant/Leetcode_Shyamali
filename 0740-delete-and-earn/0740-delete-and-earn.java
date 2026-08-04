class Solution {
    int[] dp;
    public int f(int[] temp, int idx) {
        if (idx >= temp.length) return 0;

        if (dp[idx] != -1) return dp[idx];

        int pick = temp[idx] + f(temp, idx + 2);
        int skip = f(temp, idx + 1);

        return dp[idx] = Math.max(pick, skip);
    }

    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] temp = new int[max + 1];
        for (int num : nums) {
            temp[num] += num;
        }

        dp = new int[max + 1];
        Arrays.fill(dp, -1);
        return f(temp, 1);
    }
}