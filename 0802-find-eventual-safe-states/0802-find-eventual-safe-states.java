class Solution {
    Integer cat[];
    public List<Integer> eventualSafeNodes(int[][] graph) {
        this.cat =new Integer[graph.length];
        List<Integer> res=new ArrayList<>();
        List<Integer> safeNodes=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
           if(graph[i].length==0){
            safeNodes.add(i);
           }
        }
        if(safeNodes.size()==0){
            return new ArrayList<>();
        }

        for(int i=0;i<graph.length;i++){
            boolean visited[]=new boolean[graph.length];
            boolean ans=helper(i,graph,visited,safeNodes);
            if(ans){
                res.add(i);
            }
        }
        return res;
    }
    public boolean helper(int node,int graph[][],boolean visited[],List<Integer> safeNodes){
        if(safeNodes.contains(node)){
            return true;
        }
        if(visited[node]==true){
            return false;
        }
        if(this.cat[node]!=null){
            return this.cat[node]==1;
        }
        visited[node]=true;
        boolean ans=true;
        for(int i:graph[node]){
            ans=ans && helper(i,graph,visited,safeNodes);
             
        }
        visited[node]=false;
        if(ans==true){
        this.cat[node]=1;
        }
        else{
            this.cat[node]=-1;
        }
        return ans;
    }
}