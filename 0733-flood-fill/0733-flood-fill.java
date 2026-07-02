class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     int n=image.length;
     int m= image[0].length;
     int oldColor = image[sr][sc];
     if(oldColor == color) return image;
     Queue<int[]> q = new LinkedList<>();
     q.offer(new int[]{sr,sc});
     int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
     while(!q.isEmpty()){
        int[] curr =q.poll();
        int r =curr[0];
        int c = curr[1];
        image[r][c]=color;
         for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    image[nr][nc] == oldColor) {
                    q.offer(new int[]{nr, nc});
                    // Mark as visited immediately
                    image[nr][nc] = color;
     }
         }
     }
     return image;
    }
}