class Solution {
    int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i, j});
                }else{
                    mat[i][j]=-1;
                }
            }
        }
        while(q.isEmpty()==false){
            int[] curr =q.poll();
             int r = curr[0];
            int c = curr[1];
            for(int[] d: dir){
                int nr = curr[0]+d[0];
                int nc = curr[1]+d[1];
                if(nr>=0 && nc>=0 && nr<mat.length&& nc< mat[0].length && mat[nr][nc]==-1){
                      mat[nr][nc] = mat[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return mat;
    }
}