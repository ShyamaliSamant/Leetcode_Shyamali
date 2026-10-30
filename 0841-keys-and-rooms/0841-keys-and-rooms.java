class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis= new boolean[rooms.size()];
        dfs(rooms,0,vis);
        for(int i=0; i<rooms.size(); i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, int index, boolean[] vis){
        vis[index]=true;
        for(Integer i: rooms.get(index)){
          if(!vis[i]){
            dfs(rooms, i, vis);
          }
        }
        
    }
}