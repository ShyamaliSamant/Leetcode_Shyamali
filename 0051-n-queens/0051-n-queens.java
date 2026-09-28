class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> diag1 = new HashSet<>();
        HashSet<Integer> diag2 = new HashSet<>();

        solve(0, n, board, ans, cols, diag1, diag2);

        return ans;
    }

    public void solve(
        int row,
        int n,
        char[][] board,
        List<List<String>> ans,
        HashSet<Integer> cols,
        HashSet<Integer> diag1,
        HashSet<Integer> diag2
    ) {

        if (row == n) {

            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {

            // Diagonal identifiers
            int d1 = row - col;
            int d2 = row + col;

            if (cols.contains(col) ||
                diag1.contains(d1) ||
                diag2.contains(d2)) {
                continue;
            }
            board[row][col] = 'Q';

            cols.add(col);
            diag1.add(d1);
            diag2.add(d2);

            // Explore
            solve(row + 1, n, board, ans,
                  cols, diag1, diag2);

            // Undo / Backtrack
            board[row][col] = '.';

            cols.remove(col);
            diag1.remove(d1);
            diag2.remove(d2);
        }
    }
}