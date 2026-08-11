class Solution {
  int [][] dp;
  public int f(int i , int j, int m, int n){
    if(i == m-1 && j == n-1) return 1;
    
    if(i>=m || j>=n) return 0;
    if(dp[i][j] != -1) return dp[i][j];
    int right = f(i, j+1, m, n);
    int down = f(i+1,j, m,n);
    return dp[i][j] = right+down;
  }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i =0 ; i<m ; i++){
        Arrays.fill(dp[i],-1);
        }
        return f(0,0,m,n);
    }
}