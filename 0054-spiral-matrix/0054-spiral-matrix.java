class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        boolean[][] visited = new boolean[m][n];
        int row = 0, col = 0, dir = 0;
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[row][col]);
            visited[row][col] = true;

            int nextRow = row + dirs[dir][0];
            int nextCol = col + dirs[dir][1];

            if (nextRow < 0 || nextRow >= m ||
                nextCol < 0 || nextCol >= n ||
                visited[nextRow][nextCol]) {

                dir = (dir + 1) % 4;
            }

            row += dirs[dir][0];
            col += dirs[dir][1];
        }

        return ans;
    }
}