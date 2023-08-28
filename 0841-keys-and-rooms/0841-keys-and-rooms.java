class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int visited[]=new int[rooms.size()];
        visited[0]=1;
        List<Integer> list=new ArrayList<>(rooms.get(0));
        dfs(0,list,rooms,visited);
        for(int j=0;j<visited.length;j++){
            if(visited[j]!=1){
                return false;
            }
        }
        return true;
    }
    public void dfs(int i,List<Integer> list, List<List<Integer>> rooms,int visited[]){
        visited[i]=1;
        for(int k:list){
            if(visited[k]!=1){
                dfs(k,rooms.get(k),rooms,visited);
            }
        }
        return;
    }
}