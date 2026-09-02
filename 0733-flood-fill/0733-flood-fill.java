class Solution {
    int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      int oldcolor = image[sr][sc];
      if(oldcolor == color) return image;

        dfs(image,sr,sc,oldcolor,color);
      return image;
    }
      private void dfs(int[][] image, int r, int c, int oldcolor, int color){
        image[r][c] = color;
        for(int[] d: dir){
            int nr = r + d[0];
            int nc = c + d[1];
             if (nr >= 0 && nr < image.length &&nc >= 0 && nc < image[0].length && image[nr][nc] == oldcolor) {
                dfs(image, nr, nc, oldcolor, color);
        }
      }
    }
}