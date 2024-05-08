class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int v1=prerequisites[i][0];
            int v2=prerequisites[i][1];
            graph.get(v1).add(v2);
        }
        boolean visited[]=new boolean[numCourses];
        boolean pathVisited[]=new boolean [numCourses];
        for(int i=0;i<numCourses;i++){
           
            boolean ans=dfs(i,visited,pathVisited,graph);
            if(ans){
                return false;
            }
        }
        return true;

    }

    public boolean dfs(int curr,boolean visited[],boolean pathVisited[],List<List<Integer>> graph){
        if(pathVisited[curr]){
            return true;
        }
        if(visited[curr]){
            return false;
        }
        visited[curr]=true;
        pathVisited[curr]=true;

        for(int i:graph.get(curr)){
            if(dfs(i,visited,pathVisited,graph)){
                return true;
            }
        }
        pathVisited[curr]=false;
        return false;
    }
}