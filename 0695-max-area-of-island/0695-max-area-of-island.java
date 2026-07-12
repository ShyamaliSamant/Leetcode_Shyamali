class Solution {
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1) {
                    int area = dfs(grid,i,j);
                    max = Math.max(area,max);      
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int r,int c){
        if(r<0|| c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0){
            return 0;
        }
            grid[r][c]=0;
            int area =1;
            for(int[] d:dir){
                area +=dfs(grid, r+d[0], c+d[1]);
        }
        return area;
    }
}