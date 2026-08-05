class Solution {
    int [][] dp;
    public int f(String s, int i, int j){
        if (i > j) return 0;
         if (i == j) return 1;
         if(dp[i][j] !=-1) return dp[i][j];

    if (s.charAt(i) == s.charAt(j))
        return dp[i][j] = 2 + f(s, i + 1, j - 1);

        int i_shift = f(s,i+1, j);
        int j_shift = f(s,i,j-1);
    return dp[i][j] = Math.max(i_shift , j_shift);
    }
    public int longestPalindromeSubseq(String s) {  
        int n = s.length();
        dp = new int[n][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
           return f(s, 0, n - 1);
    }
}