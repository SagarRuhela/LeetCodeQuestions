class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
      // here we make a graph 
        for(int i=0;i<prerequisites.length;i++){
            int v1=prerequisites[i][0];
            int v2=prerequisites[i][1];
            graph.get(v1).add(v2);
        }
        // now we don't need to check if we can take all courses or not 
        // we just need to check number of nodes we can react if we start with each Course
     List<Boolean> ans1=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
             boolean visited[]=new boolean  [numCourses];
            boolean ans=helper(queries[i][0],queries[i][1],graph,visited);
            ans1.add(ans);
        }
        return ans1;
    }
    public boolean helper(int curr,int dest,List<List<Integer>> graph,boolean visited[]){
        if(visited[curr]){
            return false;
        }
        if(curr==dest){
            return true;
        }
        visited[curr]=true;
        boolean ans=false;
        for(int i : graph.get(curr)){
            
                ans= ans || helper(i,dest,graph,visited);
            
        }
        return ans;

    }
}