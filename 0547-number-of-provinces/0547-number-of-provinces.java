class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count =0;
        for(int i = 0; i<isConnected.length; i++){
           if(visited[i] ==false) count++;
        dfs(isConnected,i,visited);
        }
        return count;
    }
    public void dfs(int[][] isConnected, int city, boolean[] visited){
        visited[city] = true;
        for(int j =0; j<isConnected.length; j++){
               if(isConnected[city][j]==1 && !visited[j]){
                  dfs(isConnected,j,visited);
               }
        }
    }
}