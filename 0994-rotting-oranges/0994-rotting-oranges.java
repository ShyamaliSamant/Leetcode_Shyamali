class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        int n=grid.length;
        int m= grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1) fresh++;// fresh ko ++ kre ge rotten to queue mw store
            }
        }
         int minutes = 0;
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            while (size-- > 0) {
                int[] curr = q.poll();
                for (int[] d : dir) {
                    int r = curr[0] + d[0];
                    int c = curr[1] + d[1];
                    if (r >= 0 && r < n &&
                        c >= 0 && c < m &&
                        grid[r][c] == 1) {
                        grid[r][c] = 2;
                        fresh--;
                        q.offer(new int[]{r, c});
                    }
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}